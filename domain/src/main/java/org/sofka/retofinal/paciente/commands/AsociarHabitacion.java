package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.paciente.values.HabitacionId;
import org.sofka.retofinal.paciente.values.Numero;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.paciente.values.Ubicacion;

public class AsociarHabitacion extends Command {

    private final HabitacionId habitacionId;
    private final PacienteId pacienteId;
    private final Numero numero;
    private final Ubicacion ubicacion;

    public AsociarHabitacion(HabitacionId habitacionId, PacienteId pacienteId, Numero numero, Ubicacion ubicacion) {
        this.habitacionId = habitacionId;
        this.pacienteId = pacienteId;
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public Numero getNumero() {
        return numero;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
