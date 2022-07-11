package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class AsociarPacienteCommand extends Command {

    private final PacienteId pacienteId;
    private final DoctorId doctorId;

    public AsociarPacienteCommand(PacienteId pacienteId, DoctorId doctorId) {
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
