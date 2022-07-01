package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Informacion implements ValueObject<String> {

    private final String informacion;

    public Informacion(String informacion) {
        this.informacion = Objects.requireNonNull(informacion, "La informacion no puede ser null");
    }

    @Override
    public String value() {
        return informacion;
    }
}
