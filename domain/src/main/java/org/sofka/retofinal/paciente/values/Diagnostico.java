package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Diagnostico implements ValueObject<String> {

    private final String diagnostico;

    public Diagnostico(String diagnostico) {
        this.diagnostico = Objects.requireNonNull(diagnostico, "El diagnostico no puede ser null");
        if (this.diagnostico.isBlank()) {
            throw new IllegalArgumentException("El diagnostico no puede estar vacia");
        }
        if (this.diagnostico.length() >= 100) {
            throw new IllegalArgumentException("El diagnostico no puede tener más de 100 caracteres");
        }
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diagnostico that = (Diagnostico) o;
        return Objects.equals(diagnostico, that.diagnostico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diagnostico);
    }
}
