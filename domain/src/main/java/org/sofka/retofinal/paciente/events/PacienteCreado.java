package org.sofka.retofinal.paciente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.*;

public class PacienteCreado extends DomainEvent {

    private final InformacionPersonal informacionPersonal;
    private final HistoriaClinicaId historiaClinicaId;
    private final PacienteId pacienteId;
    private final Diagnostico diagnostico;
    private final HabitacionId habitacionId;
    private final Numero numero;
    private final Ubicacion ubicacion;
    private final AcompanianteId acompanianteId;

    public PacienteCreado(InformacionPersonal informacionPersonal, HistoriaClinicaId historiaClinicaId, PacienteId pacienteId, Diagnostico diagnostico, HabitacionId habitacionId, Numero numero, Ubicacion ubicacion, AcompanianteId acompanianteId) {
        super("org.sofka.retofinal.PacienteCreado");
        this.informacionPersonal = informacionPersonal;
        this.historiaClinicaId = historiaClinicaId;
        this.pacienteId = pacienteId;
        this.diagnostico = diagnostico;
        this.habitacionId = habitacionId;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.acompanianteId = acompanianteId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }

    public HistoriaClinicaId historiaClinicaId() {
        return historiaClinicaId;
    }

    public PacienteId pacienteId() {
        return pacienteId;
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
