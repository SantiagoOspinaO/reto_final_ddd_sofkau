package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Numero implements ValueObject<Integer> {

    private final Integer numero;

    public Numero(Integer numero) {
        this.numero = Objects.requireNonNull(numero, "El numero no puede ser null");
    }

    @Override
    public Integer value() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numero numero1 = (Numero) o;
        return Objects.equals(numero, numero1.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
