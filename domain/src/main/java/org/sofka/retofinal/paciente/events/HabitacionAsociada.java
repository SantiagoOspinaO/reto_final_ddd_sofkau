package org.sofka.retofinal.paciente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.paciente.values.HabitacionId;
import org.sofka.retofinal.paciente.values.Numero;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.paciente.values.Ubicacion;

public class HabitacionAsociada extends DomainEvent {
    private final HabitacionId habitacionId;
    private final PacienteId pacienteId;
    private final Numero numero;
    private final Ubicacion ubicacion;

    public HabitacionAsociada(HabitacionId habitacionId, PacienteId pacienteId, Numero numero, Ubicacion ubicacion) {
        super("org.sofka.retofinal.HabitacionAsociada");
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
