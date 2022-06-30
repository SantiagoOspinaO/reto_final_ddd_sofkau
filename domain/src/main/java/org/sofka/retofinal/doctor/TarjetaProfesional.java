package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.retofinal.doctor.values.TarjetaProfesionalId;

public class TarjetaProfesional extends AggregateEvent<TarjetaProfesionalId> {

    public TarjetaProfesional(TarjetaProfesionalId entityId) {
        super(entityId);
    }
}
