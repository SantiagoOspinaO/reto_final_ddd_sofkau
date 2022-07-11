package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.entities.EspecialidadEntity;
import org.sofka.retofinal.doctor.values.*;

public class CrearDoctorCommand extends Command {

    private final DoctorId doctorId;
    private final InformacionPersonal informacionPersonal;
    private final ProcedimientoId procedimientoId;
    private final Descripcion descripcion;
    private final Calificacion calificacion;
    private final EspecialidadId especialidadId;
    private final EnfermeraId enfermeraId;

    public CrearDoctorCommand(DoctorId doctorId, InformacionPersonal informacionPersonal, ProcedimientoId procedimientoId,
                              Descripcion descripcion, Calificacion calificacion, EspecialidadId especialidadId, EnfermeraId enfermeraId) {
        this.doctorId = doctorId;
        this.informacionPersonal = informacionPersonal;
        this.procedimientoId = procedimientoId;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.especialidadId = especialidadId;
        this.enfermeraId = enfermeraId;
    }

    public DoctorId doctorId() {
        return doctorId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }

    public ProcedimientoId procedimientoId() {
        return procedimientoId;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Calificacion calificacion() {
        return calificacion;
    }

    public EspecialidadId especialidadId() {
        return especialidadId;
    }

    public EnfermeraId enfermeraId() {
        return enfermeraId;
    }
}
