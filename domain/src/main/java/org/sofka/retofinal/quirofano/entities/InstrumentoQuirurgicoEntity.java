package org.sofka.retofinal.quirofano.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.quirofano.values.InstrumentoQuirurgicoId;
import org.sofka.retofinal.quirofano.values.Nombre;

import java.util.Objects;

public class InstrumentoQuirurgicoEntity extends Entity<InstrumentoQuirurgicoId> {

    private Nombre nombre;

    public InstrumentoQuirurgicoEntity(InstrumentoQuirurgicoId instrumentoQuirurgicoId, Nombre nombre) {
        super(instrumentoQuirurgicoId);
        this.nombre = nombre;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
}
