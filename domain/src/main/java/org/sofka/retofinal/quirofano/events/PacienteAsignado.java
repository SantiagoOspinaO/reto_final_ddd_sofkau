package org.sofka.retofinal.quirofano.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class PacienteAsignado extends DomainEvent {

    private final PacienteId pacienteId;
    private final QuirofanoId quirofanoId;

    public PacienteAsignado(PacienteId pacienteId, QuirofanoId quirofanoId) {
        super("org.sofka.retofinal.PacienteAsignado");
        this.pacienteId = pacienteId;
        this.quirofanoId = quirofanoId;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
    }
}
