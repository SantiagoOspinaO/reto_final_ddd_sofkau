package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.EventChange;
import org.sofka.retofinal.doctor.events.DoctorCreado;
import org.sofka.retofinal.doctor.events.EspecialidadAgregada;

public class DoctorEventChange extends EventChange {

    public DoctorEventChange(Doctor doctor) {
        apply((DoctorCreado event) -> {
            doctor.procedimiento = new ProcedimientoEntity(event.procedimientoId(), event.informacion(), event.nota());
            doctor.especialidad = null;
            doctor.enfermera = null;
        });

        apply((EspecialidadAgregada event) -> {
            doctor.especialidad = new EspecialidadEntity(event.especialidadId(), event.descripcion());
        });

    }
}
