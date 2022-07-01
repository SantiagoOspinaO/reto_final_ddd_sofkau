package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.EnfermeraId;
import org.sofka.retofinal.doctor.values.InformacionPersonal;

public class EnfermeraAgregada extends DomainEvent {

    private final EnfermeraId enfermeraId;
    private final InformacionPersonal informacionPersonal;
    public EnfermeraAgregada(EnfermeraId enfermeraId, InformacionPersonal informacionPersonal) {
        super("org.sofka.retofinal.EnfermeraAgregada");
        this.enfermeraId = enfermeraId;
        this.informacionPersonal = informacionPersonal;
    }

    public EnfermeraId enfermeraId() {
        return enfermeraId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }
}
