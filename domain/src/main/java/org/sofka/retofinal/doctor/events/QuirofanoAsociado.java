package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class QuirofanoAsociado extends DomainEvent {

    private final QuirofanoId quirofanoId;

    public QuirofanoAsociado(QuirofanoId quirofanoId) {
        super("org.sofka.retofinal.QuirofanoAsociado");
        this.quirofanoId = quirofanoId;
    }
}
