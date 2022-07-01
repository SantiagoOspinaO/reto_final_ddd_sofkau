package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Calificacion implements ValueObject<Double> {

    private final Double calificacion;

    public Calificacion(Double calificacion) {
        this.calificacion = Objects.requireNonNull(calificacion, "La calificacion no puede ser null");
        if (this.calificacion.isNaN()) {
            throw new IllegalArgumentException("La calificación debe ser un numero");
        }
    }

    @Override
    public Double value() {
        return calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calificacion that = (Calificacion) o;
        return Objects.equals(calificacion, that.calificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calificacion);
    }
}
