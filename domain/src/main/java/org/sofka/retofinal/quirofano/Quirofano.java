package org.sofka.retofinal.quirofano;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.entities.AnestesiologoEntity;
import org.sofka.retofinal.quirofano.entities.InstrumentoQuirurgicoEntity;
import org.sofka.retofinal.quirofano.entities.MedicamentoEntity;
import org.sofka.retofinal.quirofano.events.*;
import org.sofka.retofinal.quirofano.values.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Quirofano extends AggregateEvent<QuirofanoId> {

    protected AnestesiologoEntity anestesiologo;
    protected Map<InstrumentoQuirurgicoId, InstrumentoQuirurgicoEntity> instrumentosQuirurgicos;
    protected Map<MedicamentoId, MedicamentoEntity> medicamentos;
    protected PacienteId pacienteId;
    protected AnestesiologoId anestesiologoId;

    public Quirofano(QuirofanoId quirofanoId, TipoCirugia tipoCirugia, Duracion duracion, Fecha fecha, AnestesiologoId anestesiologoId, InformacionPersonal informacionPersonal) {
        super(quirofanoId);
        appendChange(new QuirofanoCreado(tipoCirugia, duracion, fecha, anestesiologoId, informacionPersonal));
        subscribe(new QuirofanoEventChange(this));
    }

    private Quirofano(QuirofanoId quirofanoId) {
        super(quirofanoId);
        subscribe(new QuirofanoEventChange(this));
    }

    public static Quirofano from(QuirofanoId quirofanoId, List<DomainEvent> events) {
        var quirofano = new Quirofano(quirofanoId);
        events.forEach(quirofano::applyEvent);
        return quirofano;
    }

    public void asignarPaciente(PacienteId pacienteId, QuirofanoId quirofanoId) {
        Objects.requireNonNull(pacienteId);
        Objects.requireNonNull(quirofanoId);
        appendChange(new PacienteAsignado(pacienteId, quirofanoId)).apply();
    }

    public void asignarAnestesiologo(AnestesiologoId anestesiologoId, QuirofanoId quirofanoId) {
        Objects.requireNonNull(anestesiologoId);
        Objects.requireNonNull(quirofanoId);
        appendChange(new AnestesiologoAsignado(anestesiologoId, quirofanoId)).apply();
    }

    public void asignarInstrumentoQuirurgico(InstrumentoQuirurgicoId instrumentoQuirurgicoId, Nombre nombre) {
        Objects.requireNonNull(instrumentoQuirurgicoId);
        Objects.requireNonNull(nombre);
        appendChange(new InstrumentoQuirurgicoAsignado(instrumentoQuirurgicoId, nombre)).apply();
    }

    public void asignarMedicamento(MedicamentoId medicamentoId, NumeroSerie numeroSerie, Nombre nombre) {
        Objects.requireNonNull(medicamentoId);
        Objects.requireNonNull(numeroSerie);
        Objects.requireNonNull(nombre);
        appendChange(new MedicamentoAsignado(medicamentoId, numeroSerie, nombre)).apply();
    }
}
