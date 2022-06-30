package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.Descripcion;
import org.sofka.retofinal.doctor.values.EspecialidadId;

import java.util.Objects;
import java.util.Set;

public class Especialidad extends Entity<EspecialidadId> {

    private Descripcion descripcion;

    public Especialidad(EspecialidadId id, Descripcion descripcion) {
        super(id);
        this.descripcion = descripcion;
    }

    public void agregarEspecialidad(Descripcion descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Descripcion descripcion() {
        return descripcion;
    }
}
