package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.Identity;

public class AnestesiologoId extends Identity {

    private AnestesiologoId(String value) {
        super(value);
    }

    public AnestesiologoId() {

    }

    public static AnestesiologoId of(String value) {
        return new AnestesiologoId(value);
    }
}
