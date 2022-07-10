package org.sofka.retofinal.quirofano.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.quirofano.values.AnestesiologoId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AnestesiologoAsignado extends DomainEvent {

    private final AnestesiologoId anestesiologoId;
    private final QuirofanoId quirofanoId;

    public AnestesiologoAsignado(AnestesiologoId anestesiologoId, QuirofanoId quirofanoId) {
        super("org.sofka.retofinal.AnestesiologoAsignado");
        this.anestesiologoId = anestesiologoId;
        this.quirofanoId = quirofanoId;
    }

    public AnestesiologoId anestesiologoId() {
        return anestesiologoId;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
    }
}
