package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<Descripcion.Props> {

    private final String valor;

    public Descripcion(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String valor() {
                return null;
            }
        };
    }

    public interface Props {
        String valor();
    }
}
