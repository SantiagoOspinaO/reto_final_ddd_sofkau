package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion, "La descripcion no puede ser null");
    }

    @Override
    public String value() {
        return descripcion;
    }
}
