package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCirugia implements ValueObject<String> {

    private final String tipoCirugia;

    public TipoCirugia(String tipoCirugia) {
        this.tipoCirugia = Objects.requireNonNull(tipoCirugia);
    }

    @Override
    public String value() {
        return tipoCirugia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCirugia that = (TipoCirugia) o;
        return Objects.equals(tipoCirugia, that.tipoCirugia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoCirugia);
    }
}
