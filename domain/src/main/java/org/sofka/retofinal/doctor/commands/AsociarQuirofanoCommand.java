package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsociarQuirofanoCommand extends Command {

    private final QuirofanoId quirofanoId;
    private final DoctorId doctorId;

    public AsociarQuirofanoCommand(QuirofanoId quirofanoId, DoctorId doctorId) {
        this.quirofanoId = quirofanoId;
        this.doctorId = doctorId;
    }

    public QuirofanoId getQuirofanoId() {
        return quirofanoId;
    }

    public DoctorId getDoctorId() {
        return doctorId;
    }
}
