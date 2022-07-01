package org.sofka.retofinal.paciente.values;

import co.com.sofka.domain.generic.Identity;

public class HistoriaClinicaId extends Identity {

    public HistoriaClinicaId(String value) {
        super(value);
    }

    public HistoriaClinicaId() {

    }

    public static HistoriaClinicaId of(String value) {
        return new HistoriaClinicaId(value);
    }
}
