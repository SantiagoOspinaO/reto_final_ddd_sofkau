package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.Identity;

public class QuirofanoId extends Identity {

    private QuirofanoId(String value) {
        super(value);
    }

    public QuirofanoId() {

    }

    public static QuirofanoId of(String value) {
        return new QuirofanoId(value);
    }
}
