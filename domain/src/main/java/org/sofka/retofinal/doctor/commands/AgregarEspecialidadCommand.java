package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.Descripcion;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.doctor.values.EspecialidadId;

public class AgregarEspecialidadCommand extends Command {

    private final DoctorId doctorId;
    private final EspecialidadId especialidadId;
    private final Descripcion descripcion;

    public AgregarEspecialidadCommand(DoctorId doctorId, EspecialidadId especialidadId, Descripcion descripcion) {
        this.doctorId = doctorId;
        this.especialidadId = especialidadId;
        this.descripcion = descripcion;
    }

    public DoctorId doctorId() {
        return doctorId;
    }

    public EspecialidadId especialidadId() {
        return especialidadId;
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
