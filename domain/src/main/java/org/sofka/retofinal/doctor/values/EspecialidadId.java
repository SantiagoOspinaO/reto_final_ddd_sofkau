package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;

public class EspecialidadId extends Identity {

    private EspecialidadId(String value) {
        super(value);
    }

    public EspecialidadId() {

    }

    public static EspecialidadId of(String value) {
        return new EspecialidadId(value);
    }
}
