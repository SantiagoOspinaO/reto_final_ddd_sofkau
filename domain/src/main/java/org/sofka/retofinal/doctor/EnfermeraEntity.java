package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.EnfermeraId;
import org.sofka.retofinal.doctor.values.InformacionPersonal;

public class EnfermeraEntity extends Entity<EnfermeraId> {

    private InformacionPersonal informacionPersonal;

    public EnfermeraEntity(EnfermeraId enfermeraId, InformacionPersonal informacionPersonal) {
        super(enfermeraId);
        this.informacionPersonal = informacionPersonal;
    }
}
