package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;

public class DoctorId extends Identity {

    private DoctorId(String id) {
        super(id);
    }

    public DoctorId() {

    }

    public static DoctorId of(String id) {
        return new DoctorId(id);
    }
}
