package org.sofka.retofinal.paciente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.AcompanianteId;

public class AcompanianteAgregado extends DomainEvent {
    private final AcompanianteId acompanianteId;
    private final InformacionPersonal informacionPersonal;

    public AcompanianteAgregado(AcompanianteId acompanianteId, InformacionPersonal informacionPersonal) {
        super("org.sofka.retofinal.AcompanianteAgregado");
        this.acompanianteId = acompanianteId;
        this.informacionPersonal = informacionPersonal;
    }

    public AcompanianteId acompanianteId() {
        return acompanianteId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }
}
