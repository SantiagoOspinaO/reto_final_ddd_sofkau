package org.sofka.retofinal.doctor.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.EnfermeraId;
import org.sofka.retofinal.doctor.values.InformacionPersonal;

import java.util.Objects;

public class EnfermeraEntity extends Entity<EnfermeraId> {

    private InformacionPersonal informacionPersonal;

    public EnfermeraEntity(EnfermeraId enfermeraId, InformacionPersonal informacionPersonal) {
        super(enfermeraId);
        this.informacionPersonal = informacionPersonal;
    }

    public void actualizarInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = Objects.requireNonNull(informacionPersonal);
    }
}
