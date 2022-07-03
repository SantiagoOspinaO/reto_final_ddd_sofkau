package org.sofka.retofinal.doctor.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.Descripcion;
import org.sofka.retofinal.doctor.values.Calificacion;
import org.sofka.retofinal.doctor.values.ProcedimientoId;

import java.util.Objects;

public class ProcedimientoEntity extends Entity<ProcedimientoId> {

    private Descripcion descripcion;

    private Calificacion calificacion;

    public ProcedimientoEntity(ProcedimientoId procedimientoId, Descripcion descripcion, Calificacion calificacion) {
        super(procedimientoId);
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    public void actualizarDescripcion(Descripcion descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public void actualizarCalificacion(Calificacion calificacion) {
        this.calificacion = Objects.requireNonNull(calificacion);
    }
}
