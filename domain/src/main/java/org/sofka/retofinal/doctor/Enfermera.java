package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.EnfermeraId;
import org.sofka.retofinal.doctor.values.Nombre;

public class Enfermera extends Entity<EnfermeraId> {

    private final Nombre nombre;

    public Enfermera(EnfermeraId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public Nombre nombre() {
        return nombre;
    }
}
