package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.*;

public class CrearPacienteCommand extends Command {

    private final PacienteId pacienteId;
    private final InformacionPersonal informacionPersonal;
    private final HistoriaClinicaId historiaClinicaId;
    private final Diagnostico diagnostico;
    private final HabitacionId habitacionId;
    private final Numero numero;
    private final Ubicacion ubicacion;
    private final AcompanianteId acompanianteId;

    public CrearPacienteCommand(PacienteId pacienteId, InformacionPersonal informacionPersonal, HistoriaClinicaId historiaClinicaId, Diagnostico diagnostico, HabitacionId habitacionId, Numero numero, Ubicacion ubicacion, AcompanianteId acompanianteId) {
        this.pacienteId = pacienteId;
        this.informacionPersonal = informacionPersonal;
        this.historiaClinicaId = historiaClinicaId;
        this.diagnostico = diagnostico;
        this.habitacionId = habitacionId;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.acompanianteId = acompanianteId;
    }

    public PacienteId pacienteId() {
        return pacienteId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }

    public HistoriaClinicaId historiaClinicaId() {
        return historiaClinicaId;
    }

    public Diagnostico diagnostico() {
        return diagnostico;
    }

    public HabitacionId habitacionId() {
        return habitacionId;
    }

    public Numero numero() {
        return numero;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public AcompanianteId acompanianteId() {
        return acompanianteId;
    }
}
