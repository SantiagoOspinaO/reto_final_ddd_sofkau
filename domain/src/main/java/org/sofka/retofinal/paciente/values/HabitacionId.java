package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.Identity;
import org.sofka.retofinal.doctor.values.ProcedimientoId;

public class HabitacionId extends Identity {

    public HabitacionId(String value) {
        super(value);
    }

    public HabitacionId() {

    }

    public static HabitacionId of(String value) {
        return new HabitacionId(value);
    }
}
