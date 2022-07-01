package org.sofka.retofinal.paciente;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.retofinal.paciente.events.*;

public class PacienteEventChange extends EventChange {
    public PacienteEventChange(Paciente paciente) {

        apply((PacienteCreado event) -> {
            paciente.historiaClinica = new HistoriaClinicaEntity(event.historiaClinicaId(), event.pacienteId(), event.diagnostico());
            paciente.habitacion = new HabitacionEntity(event.habitacionId(), event.numero(), event.ubicacion());
            paciente.acompaniante = new AcompanianteEntity(event.acompanianteId(), event.informacionPersonal());
        });

        apply((HistoriaClinicaCreada event) -> {
            paciente.historiaClinica = new HistoriaClinicaEntity(event.historiaClinicaId(), event.pacienteId(), event.diagnostico());
        });

        apply((HabitacionAsociada event) -> {
            paciente.habitacion = new HabitacionEntity(event.habitacionId(), event.numero(), event.ubicacion());
        });

        apply((AcompanianteAgregado event) -> {
            paciente.acompaniante = new AcompanianteEntity(event.acompanianteId(), event.informacionPersonal());
        });

        apply((QuirofanoAsociado event) -> {
            paciente.quirofanoId = event.quirofanoId();
        });
    }
}
