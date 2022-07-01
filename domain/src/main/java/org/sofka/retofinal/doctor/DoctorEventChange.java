package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.retofinal.doctor.events.*;

public class DoctorEventChange extends EventChange {

    public DoctorEventChange(Doctor doctor) {
        apply((DoctorCreado event) -> {
            doctor.procedimiento = new ProcedimientoEntity(event.procedimientoId(), event.descripcion(), event.calificacion());
            doctor.especialidad = new EspecialidadEntity(event.especialidadId(), event.descripcion());
            doctor.enfermera = new EnfermeraEntity(event.enfermeraId(), event.informacionPersonal());
        });

        apply((EnfermeraAgregada event) -> {
            if (!doctor.enfermera.identity().equals(event.enfermeraId())) {
                throw new IllegalArgumentException("La enfermera no ha sido creada");
            }
            doctor.enfermera = new EnfermeraEntity(event.enfermeraId(), event.informacionPersonal());
        });

        apply((EspecialidadAgregada event) -> {
            if (!doctor.especialidad.identity().equals(event.especialidadId())) {
                throw new IllegalArgumentException("La especialidad no ha sido creada");
            }
            doctor.especialidad = new EspecialidadEntity(event.especialidadId(), event.descripcion());
        });

        apply((PacienteAsociado event) -> {
            if (!doctor.identity().equals(event.doctorId())) {
                throw new IllegalArgumentException("El doctor no ha sido creado");
            }
            doctor.pacienteId = event.pacienteId();
        });

        apply((QuirofanoAsociado event) -> {
            if (!doctor.identity().equals(event.doctorId())) {
                throw new IllegalArgumentException("El doctor no ha sido creado");
            }
            doctor.quirofanoId = event.quirofanoId();
        });
    }
}
