package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.Identity;

public class MedicamentoId extends Identity {

    private MedicamentoId(String value) {
        super(value);
    }

    public MedicamentoId() {

    }

    public static MedicamentoId of(String value) {
        return new MedicamentoId(value);
    }
}
