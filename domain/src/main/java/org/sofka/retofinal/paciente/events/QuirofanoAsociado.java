package org.sofka.retofinal.paciente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class QuirofanoAsociado extends DomainEvent {
    private final QuirofanoId quirofanoId;
    private final PacienteId pacienteId;

    public QuirofanoAsociado(QuirofanoId quirofanoId, PacienteId pacienteId) {
        super("org.sofka.retofinal.QuirofanoAsociado");
        this.quirofanoId = quirofanoId;
        this.pacienteId = pacienteId;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }
}
