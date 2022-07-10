package org.sofka.retofinal.quirofano;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.retofinal.quirofano.entities.AnestesiologoEntity;
import org.sofka.retofinal.quirofano.entities.InstrumentoQuirurgicoEntity;
import org.sofka.retofinal.quirofano.entities.MedicamentoEntity;
import org.sofka.retofinal.quirofano.events.*;

import java.util.HashMap;

public class QuirofanoEventChange extends EventChange {
    public QuirofanoEventChange(Quirofano quirofano) {

        apply((QuirofanoCreado event) -> {
            quirofano.anestesiologo = new AnestesiologoEntity(event.anestesiologoId(), event.informacionPersonal());
            quirofano.instrumentosQuirurgicos = new HashMap<>();
            quirofano.medicamentos = new HashMap<>();
        });

        apply((PacienteAsignado event) -> {
            if (!quirofano.identity().equals(event.quirofanoId())) {
                throw new IllegalArgumentException("El quirofano no ha sido creado");
            }
            quirofano.pacienteId = event.pacienteId();
        });

        apply((InstrumentoQuirurgicoAsignado event) -> {
            var instrumentoQuirurgicoId = event.instrumentoQuirurgicoId();
            var instrumentoQuirurgico = new InstrumentoQuirurgicoEntity(instrumentoQuirurgicoId, event.nombre());
            quirofano.instrumentosQuirurgicos.put(instrumentoQuirurgicoId, instrumentoQuirurgico);
        });

        apply((MedicamentoAsignado event) -> {
            var medicamentoId = event.medicamentoId();
            var medicamento = new MedicamentoEntity(medicamentoId, event.numeroSerie(), event.nombre());
            var numMedicamentos = quirofano.medicamentos.size();

            if (numMedicamentos == 10) {
                throw new IllegalArgumentException("No se puede asignar más medicamentos");
            }
            quirofano.medicamentos.put(medicamentoId, medicamento);
        });

        apply((AnestesiologoAsignado event) -> {
            if (!quirofano.anestesiologo.identity().equals(event.anestesiologoId())) {
                throw new IllegalArgumentException("El anestesiologo no ha sido creado");
            }
            quirofano.anestesiologoId = event.anestesiologoId();
        });
    }
}
