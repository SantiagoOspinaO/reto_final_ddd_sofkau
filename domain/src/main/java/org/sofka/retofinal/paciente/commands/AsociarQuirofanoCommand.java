package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsociarQuirofanoCommand extends Command {

    private final QuirofanoId quirofanoId;
    private final PacienteId pacienteId;

    public AsociarQuirofanoCommand(QuirofanoId quirofanoId, PacienteId pacienteId) {
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
