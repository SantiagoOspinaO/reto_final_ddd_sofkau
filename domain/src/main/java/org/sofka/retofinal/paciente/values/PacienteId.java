package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.Identity;
import org.sofka.retofinal.doctor.values.ProcedimientoId;

public class PacienteId extends Identity {

    public PacienteId(String value) {
        super(value);
    }

    public PacienteId() {

    }

    public static PacienteId of(String value) {
        return new PacienteId(value);
    }
}
