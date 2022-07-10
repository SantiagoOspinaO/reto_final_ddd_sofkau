package org.sofka.retofinal.quirofano.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.quirofano.values.InstrumentoQuirurgicoId;
import org.sofka.retofinal.quirofano.values.Nombre;

public class InstrumentoQuirurgicoAsignado extends DomainEvent {

    private final InstrumentoQuirurgicoId instrumentoQuirurgicoId;
    private final Nombre nombre;

    public InstrumentoQuirurgicoAsignado(InstrumentoQuirurgicoId instrumentoQuirurgicoId, Nombre nombre) {
        super("org.sofka.retofinal.InstrumentoQuirurgicoAsignado");
        this.instrumentoQuirurgicoId = instrumentoQuirurgicoId;
        this.nombre = nombre;
    }

    public InstrumentoQuirurgicoId instrumentoQuirurgicoId() {
        return instrumentoQuirurgicoId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
