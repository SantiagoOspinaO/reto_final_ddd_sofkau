package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.AcompanianteId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class AgregarAcompañante extends Command {

    private final PacienteId pacienteId;
    private final AcompanianteId acompanianteId;
    private final InformacionPersonal informacionPersonal;

    public AgregarAcompañante(PacienteId pacienteId, AcompanianteId acompanianteId, InformacionPersonal informacionPersonal) {
        this.pacienteId = pacienteId;
        this.acompanianteId = acompanianteId;
        this.informacionPersonal = informacionPersonal;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public AcompanianteId getAcompanianteId() {
        return acompanianteId;
    }

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }
}
