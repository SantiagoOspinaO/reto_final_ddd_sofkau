package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;

public class EnfermeraId extends Identity {

    private EnfermeraId(String value) {
        super(value);
    }

    public EnfermeraId() {

    }

    public static EnfermeraId of(String value) {
        return new EnfermeraId(value);
    }
}
