package org.sofka.retofinal.quirofano.values;

import co.com.sofka.domain.generic.Identity;
import org.sofka.retofinal.paciente.values.HabitacionId;

public class EspecialistaId extends Identity {

    private EspecialistaId(String value) {
        super(value);
    }

    public EspecialistaId() {

    }

    public static EspecialistaId of(String value) {
        return new EspecialistaId(value);
    }
}
