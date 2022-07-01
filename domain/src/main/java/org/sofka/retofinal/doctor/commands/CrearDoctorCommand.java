package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.EspecialidadEntity;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.doctor.values.InformacionPersonal;

public class CrearDoctorCommand extends Command {

    private final DoctorId doctorId;
    private final InformacionPersonal informacionPersonal;
    private final EspecialidadEntity especialidad;

    public CrearDoctorCommand(DoctorId doctorId, InformacionPersonal informacionPersonal, EspecialidadEntity especialidad) {
        this.doctorId = doctorId;
        this.informacionPersonal = informacionPersonal;
        this.especialidad = especialidad;
    }
}
