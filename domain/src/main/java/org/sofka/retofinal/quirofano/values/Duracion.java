package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duracion implements ValueObject<String> {

    private final String duracion;

    public Duracion(String duracion) {
        this.duracion = Objects.requireNonNull(duracion);
    }

    @Override
    public String value() {
        return duracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duracion duracion1 = (Duracion) o;
        return Objects.equals(duracion, duracion1.duracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duracion);
    }
}
