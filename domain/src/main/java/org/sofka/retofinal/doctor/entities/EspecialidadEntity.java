package org.sofka.retofinal.doctor.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.Descripcion;
import org.sofka.retofinal.doctor.values.EspecialidadId;

import java.util.Objects;

public class EspecialidadEntity extends Entity<EspecialidadId> {

    private Descripcion descripcion;

    public EspecialidadEntity(EspecialidadId especialidadId, Descripcion descripcion) {
        super(especialidadId);
        this.descripcion = descripcion;
    }

    public void actualizarDescripcion(Descripcion descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }
}
