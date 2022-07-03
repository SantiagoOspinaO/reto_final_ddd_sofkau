package org.sofka.retofinal.quirofano;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.quirofano.values.Especialidad;
import org.sofka.retofinal.quirofano.values.EspecialistaId;

import java.util.Objects;

public class EspecialistaEntity extends Entity<EspecialistaId> {

    private Especialidad especialidad;
    private InformacionPersonal informacionPersonal;


    public EspecialistaEntity(EspecialistaId especialistaId, Especialidad especialidad, InformacionPersonal informacionPersonal) {
        super(especialistaId);
        this.especialidad = especialidad;
        this.informacionPersonal = informacionPersonal;
    }

    public void actualizarInformacionPersonal(InformacionPersonal informacionPersonal) {
        this.informacionPersonal = Objects.requireNonNull(informacionPersonal);
    }
}
