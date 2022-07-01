package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.events.*;
import org.sofka.retofinal.doctor.values.*;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

import javax.print.Doc;
import java.util.List;
import java.util.Objects;

public class Doctor extends AggregateEvent<DoctorId> {

    protected ProcedimientoEntity procedimiento;
    protected EspecialidadEntity especialidad;
    protected EnfermeraEntity enfermera;
    protected PacienteId pacienteId;
    protected QuirofanoId quirofanoId;

    public Doctor(DoctorId doctorId, InformacionPersonal informacionPersonal, ProcedimientoId procedimientoId,
                  Descripcion descripcion, Calificacion calificacion, EspecialidadId especialidadId, EnfermeraId enfermeraId) {
        super(doctorId);
        appendChange(new DoctorCreado(informacionPersonal, procedimientoId, descripcion, calificacion, especialidadId, enfermeraId)).apply();
        subscribe(new DoctorEventChange(this));
    }

    private Doctor(DoctorId doctorId) {
        super(doctorId);
        subscribe(new DoctorEventChange(this));
    }

    public static Doctor from(DoctorId doctorId, List<DomainEvent> events) {
        var doctor = new Doctor(doctorId);
        events.forEach(doctor::applyEvent);
        return doctor;
    }

    public void agregarEnfermera(EnfermeraId enfermeraId, InformacionPersonal informacionPersonal) {
        Objects.requireNonNull(enfermeraId);
        Objects.requireNonNull(informacionPersonal);
        appendChange(new EnfermeraAgregada(enfermeraId, informacionPersonal)).apply();
    }

    public void agregarEspecialidad(EspecialidadId especialidadId, Descripcion descripcion) {
        Objects.requireNonNull(especialidadId);
        Objects.requireNonNull(descripcion);
        appendChange(new EspecialidadAgregada(especialidadId, descripcion)).apply();
    }

    public void asociarQuirofano(QuirofanoId quirofanoId, DoctorId doctorId) {
        Objects.requireNonNull(quirofanoId);
        Objects.requireNonNull(doctorId);
        appendChange(new QuirofanoAsociado(quirofanoId, doctorId)).apply();
    }

    public void asociarPaciente(PacienteId pacienteId, DoctorId doctorId) {
        Objects.requireNonNull(pacienteId);
        Objects.requireNonNull(doctorId);
        appendChange(new PacienteAsociado(pacienteId, doctorId)).apply();
    }
}
