package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;

public class EnfermeraId extends Identity {

    private EnfermeraId(String id) {
        super(id);
    }

    public EnfermeraId() {

    }

    public static EnfermeraId of(String id) {
        return new EnfermeraId(id);
    }
}
