package org.sofka.retofinal.quirofano.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.quirofano.values.Especialidad;
import org.sofka.retofinal.quirofano.values.AnestesiologoId;

import java.util.Objects;

public class AnestesiologoEntity extends Entity<AnestesiologoId> {

    private InformacionPersonal informacionPersonal;

    public AnestesiologoEntity(AnestesiologoId anestesiologoId, InformacionPersonal informacionPersonal) {
        super(anestesiologoId);
        this.informacionPersonal = informacionPersonal;
    }

    public void actualizarInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = Objects.requireNonNull(informacionPersonal);
    }
}
