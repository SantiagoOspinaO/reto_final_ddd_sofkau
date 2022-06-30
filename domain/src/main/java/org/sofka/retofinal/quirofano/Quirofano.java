package org.sofka.retofinal.quirofano;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class Quirofano extends AggregateEvent<QuirofanoId> {

    public Quirofano(QuirofanoId entityId) {
        super(entityId);
    }
}
