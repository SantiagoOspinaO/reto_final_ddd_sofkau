package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.entities.EspecialidadEntity;
import org.sofka.retofinal.doctor.values.*;

public class CrearDoctorCommand extends Command {

    private final DoctorId doctorId;
    private final InformacionPersonal informacionPersonal;
    private final EspecialidadEntity especialidad;
    private final ProcedimientoId procedimientoId;
    private final Descripcion descripcion;
    private final Calificacion calificacion;
    private final EspecialidadId especialidadId;
    private final EnfermeraId enfermeraId;

    public CrearDoctorCommand(DoctorId doctorId, InformacionPersonal informacionPersonal, EspecialidadEntity especialidad,
                              ProcedimientoId procedimientoId, Descripcion descripcion, Calificacion calificacion,
                              EspecialidadId especialidadId, EnfermeraId enfermeraId) {
        this.doctorId = doctorId;
        this.informacionPersonal = informacionPersonal;
        this.especialidad = especialidad;
        this.procedimientoId = procedimientoId;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.especialidadId = especialidadId;
        this.enfermeraId = enfermeraId;
    }

    public DoctorId getDoctorId() {
        return doctorId;
    }

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }

    public EspecialidadEntity getEspecialidad() {
        return especialidad;
    }

    public ProcedimientoId getProcedimientoId() {
        return procedimientoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }

    public EnfermeraId getEnfermeraId() {
        return enfermeraId;
    }
}
