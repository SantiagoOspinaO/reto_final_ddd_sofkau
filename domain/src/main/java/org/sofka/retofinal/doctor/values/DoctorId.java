package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.Identity;

public class DoctorId extends Identity {

    private final Type tipoDocumento;
    private final String numero;

    public DoctorId(Type tipoDocumento, String numero) {
        this.tipoDocumento = tipoDocumento;
        this.numero = numero;
    }

    @Override
    public String value() {
        return tipoDocumento + "-" + numero;
    }

    public enum Type {
        TI, CC, PASAPORTE
    }

    public Type getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumero() {
        return numero;
    }
}
