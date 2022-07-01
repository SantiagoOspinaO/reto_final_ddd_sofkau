package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class QuirofanoAsociado extends DomainEvent {

    private final QuirofanoId quirofanoId;
    private final DoctorId  doctorId;

    public QuirofanoAsociado(QuirofanoId quirofanoId, DoctorId doctorId) {
        super("org.sofka.retofinal.QuirofanoAsociado");
        this.quirofanoId = quirofanoId;
        this.doctorId = doctorId;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
    }

    public DoctorId doctorId() {
        return doctorId;
    }
}
