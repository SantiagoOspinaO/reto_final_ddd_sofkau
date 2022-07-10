package org.sofka.retofinal.quirofano.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsignarPacienteCommand extends Command {

    private final PacienteId pacienteId;
    private final QuirofanoId quirofanoId;

    public AsignarPacienteCommand(PacienteId pacienteId, QuirofanoId quirofanoId) {
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
