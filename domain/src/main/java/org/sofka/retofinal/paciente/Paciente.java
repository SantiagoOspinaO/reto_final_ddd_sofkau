package org.sofka.retofinal.paciente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.entities.AcompanianteEntity;
import org.sofka.retofinal.paciente.entities.HabitacionEntity;
import org.sofka.retofinal.paciente.entities.HistoriaClinicaEntity;
import org.sofka.retofinal.paciente.events.*;
import org.sofka.retofinal.paciente.values.*;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

import java.util.List;
import java.util.Objects;

public class Paciente extends AggregateEvent<PacienteId> {

    protected HistoriaClinicaEntity historiaClinica;
    protected HabitacionEntity habitacion;
    protected AcompanianteEntity acompaniante;
    protected QuirofanoId quirofanoId;

    public Paciente(PacienteId pacienteId, InformacionPersonal informacionPersonal, HistoriaClinicaId historiaClinicaId, Diagnostico diagnostico, HabitacionId habitacionId, Numero numero, Ubicacion ubicacion, AcompanianteId acompanianteId) {
        super(pacienteId);
        appendChange(new PacienteCreado(informacionPersonal, historiaClinicaId, pacienteId, diagnostico, habitacionId, numero, ubicacion, acompanianteId));
        subscribe(new PacienteEventChange(this));
    }


    private Paciente(PacienteId pacienteId) {
        super(pacienteId);
        subscribe(new PacienteEventChange(this));
    }

    public static Paciente from(PacienteId pacienteId, List<DomainEvent> events) {
        var paciente = new Paciente(pacienteId);
        events.forEach(paciente::applyEvent);
        return paciente;
    }

    public void crearHistoriaClinica(HistoriaClinicaId historiaClinicaId, PacienteId pacienteId, Diagnostico diagnostico) {
        Objects.requireNonNull(historiaClinicaId);
        Objects.requireNonNull(pacienteId);
        Objects.requireNonNull(diagnostico);
        appendChange(new HistoriaClinicaCreada(historiaClinicaId, pacienteId, diagnostico));
    }

    public void asociarHabitacion(HabitacionId habitacionId, PacienteId pacienteId, Numero numero, Ubicacion ubicacion) {
        Objects.requireNonNull(habitacionId);
        Objects.requireNonNull(pacienteId);
        Objects.requireNonNull(numero);
        Objects.requireNonNull(ubicacion);
        appendChange(new HabitacionAsociada(habitacionId, pacienteId, numero, ubicacion));
    }

    public void agregarAcompaniante(AcompanianteId acompanianteId, InformacionPersonal informacionPersonal) {
        Objects.requireNonNull(acompanianteId);
        Objects.requireNonNull(informacionPersonal);
        appendChange(new AcompanianteAgregado(acompanianteId, informacionPersonal));
    }

    public void asociarQuirofano(QuirofanoId quirofanoId, PacienteId pacienteId) {
        Objects.requireNonNull(quirofanoId);
        Objects.requireNonNull(pacienteId);
        appendChange(new QuirofanoAsociado(quirofanoId, pacienteId));
    }

}
