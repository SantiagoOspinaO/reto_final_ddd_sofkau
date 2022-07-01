package org.sofka.retofinal.paciente;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.values.PacienteId;

public class Paciente extends AggregateEvent<PacienteId> {

    protected InformacionPersonal informacionPersonal;
    protected HistoriaClinicaEntity historiaClinica;
    protected HabitacionEntity eps;
    protected AcompañanteEntity acompañante;
    protected DoctorId doctorId;

    public Paciente(PacienteId entityId) {
        super(entityId);
    }

}
