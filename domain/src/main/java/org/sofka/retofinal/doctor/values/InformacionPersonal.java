package org.sofka.retofinal.doctor.values;


import co.com.sofka.domain.generic.ValueObject;

public class InformacionPersonal implements ValueObject<InformacionPersonal.Props> {

    private final String nombre;
    private final Integer celular;
    private final String direccion;

    public InformacionPersonal(String nombre, Integer celular, String direccion) {
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return null;
            }

            @Override
            public Integer celular() {
                return null;
            }

            @Override
            public String direccion() {
                return null;
            }

        };
    }

    public interface Props {
        String nombre();
        Integer celular();
        String direccion();
    }
}
