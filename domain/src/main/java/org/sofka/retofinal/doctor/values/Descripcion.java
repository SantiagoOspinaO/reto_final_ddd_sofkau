package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {

    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion, "La descripcion no puede ser null");
        if (this.descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripcion no puede estar vacia");
        }
        if (this.descripcion.length() >= 100) {
            throw new IllegalArgumentException("La descripcion no puede tener más de 100 caracteres");
        }
    }

    @Override
    public String value() {
        return descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descripcion that = (Descripcion) o;
        return Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descripcion);
    }
}
