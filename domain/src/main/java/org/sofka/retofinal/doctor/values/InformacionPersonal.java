package org.sofka.retofinal.doctor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class InformacionPersonal implements ValueObject<InformacionPersonal.Props> {

    private final String tipoDocumento;
    private final Integer numero;
    private final String nombre;
    private final String celular;
    private final String direccion;

    public InformacionPersonal(String tipoDocumento, Integer numero, String nombre, String celular, String direccion) {
        this.tipoDocumento = Objects.requireNonNull(tipoDocumento, "El tipo de documenteo no puede ser null");
        this.numero = Objects.requireNonNull(numero, "El numero no puede ser null");
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        this.celular = Objects.requireNonNull(celular, "El celular no puede ser null");
        this.direccion = Objects.requireNonNull(direccion, "La direccion no puede ser null");
    }

    public interface Props {
        String tipoDocumento();
        String numero();
        String nombre();
        String celular();
        String direccion();
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
            public String celular() {
                return null;
            }

            @Override
            public String direccion() {
                return null;
            }
        };
    }
}
