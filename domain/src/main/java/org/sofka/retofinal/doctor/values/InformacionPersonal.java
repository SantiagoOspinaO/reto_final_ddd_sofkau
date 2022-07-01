package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

public class InformacionPersonal implements ValueObject<InformacionPersonal.Props> {

    private final String tipoDocumento;
    private final Integer numero;
    private final String nombre;
    private final Integer celular;
    private final String direccion;

    public InformacionPersonal(String tipoDocumento, Integer numero, String nombre, Integer celular, String direccion) {
        this.tipoDocumento = tipoDocumento;
        this.numero = numero;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoDocumento() {
                return null;
            }

            @Override
            public String numero() {
                return null;
            }

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
        String tipoDocumento();
        String numero();
        String nombre();
        Integer celular();
        String direccion();
    }
}
