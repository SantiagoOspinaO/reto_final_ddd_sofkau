package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.retofinal.doctor.events.DoctorCreado;
import org.sofka.retofinal.doctor.events.EspecialidadAgregada;
import org.sofka.retofinal.doctor.events.PacienteAsociado;
import org.sofka.retofinal.doctor.events.QuirofanoAsociado;
import org.sofka.retofinal.doctor.values.*;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

import java.util.Objects;

public class Doctor extends AggregateEvent<DoctorId> {

    protected InformacionPersonal informacionPersonal;
    protected Enfermera enfermera;
    protected TarjetaProfesional tarjetaProfesional;
    protected Especialidad especialidad;
    protected PacienteId pacienteId;
    protected QuirofanoId quirofanoId;

    public Doctor(DoctorId doctorId, EnfermeraId enfermeraId, TarjetaProfesionalId tarjetaProfesionalId, EspecialidadId especialidadId) {
        super(doctorId);
        appendChange(new DoctorCreado(enfermeraId, tarjetaProfesionalId, especialidadId)).apply();
        subscribe(new DoctorEventChange(this));
    }

    public void agregarEspecialidad(EspecialidadId especialidadId, Descripcion descripcion) {
        Objects.requireNonNull(especialidadId);
        Objects.requireNonNull(descripcion);
        appendChange(new EspecialidadAgregada(especialidadId, descripcion)).apply();
    }

    public void asociarQuirofano(QuirofanoId quirofanoId) {
        Objects.requireNonNull(quirofanoId);
        appendChange(new QuirofanoAsociado(quirofanoId)).apply();
    }

    public void asociarPaciente(PacienteId pacienteId) {
        Objects.requireNonNull(pacienteId);
        appendChange(new PacienteAsociado(pacienteId)).apply();
    }

    public void asignarEnfermera() {

    }
}
