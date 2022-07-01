package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {

    private final String ubicacion;

    public Ubicacion(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion, "La ubicación no puede ser null");
        if (this.ubicacion.isBlank()) {
            throw new IllegalArgumentException("La ubicacion no puede estar vacia");
        }
        if (this.ubicacion.length() >= 100) {
            throw new IllegalArgumentException("La ubicacion no puede tener más de 100 caracteres");
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
        Ubicacion ubicacion1 = (Ubicacion) o;
        return Objects.equals(ubicacion, ubicacion1.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ubicacion);
    }
}
