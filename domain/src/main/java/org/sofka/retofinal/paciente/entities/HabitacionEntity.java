package org.sofka.retofinal.paciente.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.Descripcion;
import org.sofka.retofinal.paciente.values.HabitacionId;
import org.sofka.retofinal.paciente.values.Numero;
import org.sofka.retofinal.paciente.values.Ubicacion;

import java.util.Objects;

public class HabitacionEntity extends Entity<HabitacionId> {

    private Numero numero;
    private Ubicacion ubicacion;

    public HabitacionEntity(HabitacionId habitacionId, Numero numero, Ubicacion ubicacion) {
        super(habitacionId);
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public void actualizarUbicacion(Ubicacion ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }
}
