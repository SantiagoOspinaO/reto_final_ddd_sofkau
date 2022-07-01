package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class AsociarPaciente extends Command {

    private final PacienteId pacienteId;
    private final DoctorId doctorId;

    public AsociarPaciente(PacienteId pacienteId, DoctorId doctorId) {
        this.pacienteId = pacienteId;
        this.doctorId = doctorId;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public DoctorId getDoctorId() {
        return doctorId;
    }
}
