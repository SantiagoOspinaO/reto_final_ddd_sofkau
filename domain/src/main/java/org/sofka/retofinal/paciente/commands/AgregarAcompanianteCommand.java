package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.AcompanianteId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class AgregarAcompanianteCommand extends Command {

    private final PacienteId pacienteId;
    private final AcompanianteId acompanianteId;
    private final InformacionPersonal informacionPersonal;

    public AgregarAcompanianteCommand(PacienteId pacienteId, AcompanianteId acompanianteId, InformacionPersonal informacionPersonal) {
        this.pacienteId = pacienteId;
        this.acompanianteId = acompanianteId;
        this.informacionPersonal = informacionPersonal;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }

    public AcompanianteId acompanianteId() {
        return acompanianteId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }
}
