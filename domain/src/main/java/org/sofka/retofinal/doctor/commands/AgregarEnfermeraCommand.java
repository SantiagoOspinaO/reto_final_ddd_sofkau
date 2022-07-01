package org.sofka.retofinal.doctor.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.doctor.values.EnfermeraId;
import org.sofka.retofinal.doctor.values.InformacionPersonal;

public class AgregarEnfermeraCommand extends Command {

    private final DoctorId doctorId;
    private final EnfermeraId enfermeraId;
    private final InformacionPersonal informacionPersonal;

    public AgregarEnfermeraCommand(DoctorId doctorId, EnfermeraId enfermeraId, InformacionPersonal informacionPersonal) {
        this.doctorId = doctorId;
        this.enfermeraId = enfermeraId;
        this.informacionPersonal = informacionPersonal;
    }

    public DoctorId getDoctorId() {
        return doctorId;
    }

    public EnfermeraId getEnfermeraId() {
        return enfermeraId;
    }

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }
}
