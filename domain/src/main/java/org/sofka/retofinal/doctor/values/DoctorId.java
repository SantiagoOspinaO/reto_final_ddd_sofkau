package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;

public class DoctorId extends Identity {

    private DoctorId(String value) {
        super(value);
    }

    public DoctorId() {

    }

    public static DoctorId of(String value) {
        return new DoctorId(value);
    }
}
