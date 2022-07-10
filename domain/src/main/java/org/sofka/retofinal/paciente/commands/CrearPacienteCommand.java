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

    public PacienteId getPacienteId() {
        return pacienteId;
    }

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }

    public HistoriaClinicaId getHistoriaClinicaId() {
        return historiaClinicaId;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public Numero getNumero() {
        return numero;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public AcompanianteId getAcompanianteId() {
        return acompanianteId;
    }
}
