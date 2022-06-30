package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.paciente.values.PacienteId;

public class PacienteAsociado extends DomainEvent {

    private final PacienteId pacienteId;

    public PacienteAsociado(PacienteId pacienteId) {
        super("org.sofka.retofinal.PacienteAsociado");
        this.pacienteId = pacienteId;
    }
}
