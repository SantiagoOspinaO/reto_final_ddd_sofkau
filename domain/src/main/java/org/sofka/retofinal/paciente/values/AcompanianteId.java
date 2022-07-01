package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.Identity;

public class AcompanianteId extends Identity {

    private AcompanianteId(String id) {
        super(id);
    }

    public AcompanianteId() {

    }

    public static AcompanianteId of(String id) {
        return new AcompanianteId(id);
    }
}
