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

    public DoctorId getDoctorId() {
        return doctorId;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
