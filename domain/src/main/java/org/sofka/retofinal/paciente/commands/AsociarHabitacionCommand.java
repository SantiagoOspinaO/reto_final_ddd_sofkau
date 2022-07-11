package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.paciente.values.HabitacionId;
import org.sofka.retofinal.paciente.values.Numero;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.paciente.values.Ubicacion;

public class AsociarHabitacionCommand extends Command {

    private final HabitacionId habitacionId;
    private final PacienteId pacienteId;
    private final Numero numero;
    private final Ubicacion ubicacion;

    public AsociarHabitacionCommand(HabitacionId habitacionId, PacienteId pacienteId, Numero numero, Ubicacion ubicacion) {
        this.habitacionId = habitacionId;
        this.pacienteId = pacienteId;
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public HabitacionId habitacionId() {
        return habitacionId;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }

    public Numero numero() {
        return numero;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }
}
