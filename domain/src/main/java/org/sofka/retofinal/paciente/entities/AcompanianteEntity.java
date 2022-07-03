package org.sofka.retofinal.paciente.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.AcompanianteId;

import java.util.Objects;

public class AcompanianteEntity extends Entity<AcompanianteId> {

    private InformacionPersonal informacionPersonal;

    public AcompanianteEntity(AcompanianteId acompanianteId, InformacionPersonal informacionPersonal) {
        super(acompanianteId);
        this.informacionPersonal = informacionPersonal;
    }

    public void actualizarInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = Objects.requireNonNull(informacionPersonal);
    }
}
