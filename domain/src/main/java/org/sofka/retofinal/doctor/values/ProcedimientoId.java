package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;
import org.sofka.retofinal.doctor.ProcedimientoEntity;

public class ProcedimientoId extends Identity {

    public ProcedimientoId(String value) {
        super(value);
    }

    public ProcedimientoId() {

    }

    public static ProcedimientoId of(String value) {
        return new ProcedimientoId(value);
    }
}
