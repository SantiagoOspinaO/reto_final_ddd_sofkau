package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsociarQuirofano extends Command {

    private final QuirofanoId quirofanoId;
    private final PacienteId pacienteId;

    public AsociarQuirofano(QuirofanoId quirofanoId, PacienteId pacienteId) {
        this.quirofanoId = quirofanoId;
        this.pacienteId = pacienteId;
    }

    public QuirofanoId getQuirofanoId() {
        return quirofanoId;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }
}
