package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class PacienteAsociado extends DomainEvent {

    private final PacienteId pacienteId;
    private final DoctorId doctorId;

    public PacienteAsociado(PacienteId pacienteId, DoctorId doctorId) {
        super("org.sofka.retofinal.PacienteAsociado");
        this.pacienteId = pacienteId;
        this.doctorId = doctorId;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }

    public DoctorId doctorId() {
        return doctorId;
    }
}
