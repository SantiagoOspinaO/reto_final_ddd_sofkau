package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.Identity;

public class InstrumentoQuirurgicoId extends Identity {

    private InstrumentoQuirurgicoId(String value) {
        super(value);
    }

    public InstrumentoQuirurgicoId() {

    }

    public static InstrumentoQuirurgicoId of(String value) {
        return new InstrumentoQuirurgicoId(value);
    }
}
