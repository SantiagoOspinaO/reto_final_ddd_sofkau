package org.sofka.retofinal.paciente;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.retofinal.paciente.entities.AcompanianteEntity;
import org.sofka.retofinal.paciente.entities.HabitacionEntity;
import org.sofka.retofinal.paciente.entities.HistoriaClinicaEntity;
import org.sofka.retofinal.paciente.events.*;

public class PacienteEventChange extends EventChange {
    public PacienteEventChange(Paciente paciente) {

        apply((PacienteCreado event) -> {
            paciente.historiaClinica = new HistoriaClinicaEntity(event.historiaClinicaId(), event.pacienteId(), event.diagnostico());
            paciente.habitacion = new HabitacionEntity(event.habitacionId(), event.numero(), event.ubicacion());
            paciente.acompaniante = new AcompanianteEntity(event.acompanianteId(), event.informacionPersonal());
        });

        apply((HistoriaClinicaCreada event) -> {
            if (!paciente.identity().equals(event.pacienteId())) {
                throw new IllegalArgumentException("El paciente no ha sido creado");
            }
            paciente.historiaClinica = new HistoriaClinicaEntity(event.historiaClinicaId(), event.pacienteId(), event.diagnostico());
        });

        apply((HabitacionAsociada event) -> {
            if (!paciente.habitacion.identity().equals(event.habitacionId())) {
                throw new IllegalArgumentException("La habitación no ha sido creada");
            }
            paciente.habitacion = new HabitacionEntity(event.habitacionId(), event.numero(), event.ubicacion());
        });

        apply((AcompanianteAgregado event) -> {
            if (!paciente.acompaniante.identity().equals(event.acompanianteId())) {
                throw new IllegalArgumentException("El acompañante no ha sido creado");
            }
            paciente.acompaniante = new AcompanianteEntity(event.acompanianteId(), event.informacionPersonal());
        });

        apply((QuirofanoAsociado event) -> {
            if (!paciente.identity().equals(event.pacienteId())) {
                throw new IllegalArgumentException("El paciente no ha sido creado");
            }
            paciente.quirofanoId = event.quirofanoId();
        });
    }
}
