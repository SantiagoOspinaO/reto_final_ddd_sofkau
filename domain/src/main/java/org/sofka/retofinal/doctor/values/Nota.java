package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nota implements ValueObject<Double> {

    private final Double nota;

    public Nota(Double nota) {
        this.nota = Objects.requireNonNull(nota, "La nota no puede ser null");
    }

    @Override
    public Double value() {
        return nota;
    }
}
