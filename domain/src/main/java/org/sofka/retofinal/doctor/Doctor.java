package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.retofinal.doctor.events.*;
import org.sofka.retofinal.doctor.values.*;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

import java.util.Objects;

public class Doctor extends AggregateEvent<DoctorId> {

    protected ProcedimientoEntity procedimiento;
    protected EspecialidadEntity especialidad;
    protected EnfermeraEntity enfermera;

    public Doctor(DoctorId doctorId, InformacionPersonal informacionPersonal, ProcedimientoId procedimientoId,
                  Informacion informacion, Nota nota, EspecialidadId especialidadId) {
        super(doctorId);
        appendChange(new DoctorCreado(informacionPersonal, procedimientoId, informacion, nota, especialidadId)).apply();
        subscribe(new DoctorEventChange(this));
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

    public void asociarQuirofano(QuirofanoId quirofanoId) {
        Objects.requireNonNull(quirofanoId);
        appendChange(new QuirofanoAsociado(quirofanoId)).apply();
    }

    public void asociarPaciente(PacienteId pacienteId) {
        Objects.requireNonNull(pacienteId);
        appendChange(new PacienteAsociado(pacienteId)).apply();
    }
}
