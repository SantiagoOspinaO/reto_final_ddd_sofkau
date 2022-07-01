package org.sofka.retofinal.quirofano;

import co.com.sofka.domain.generic.AggregateEvent;
import org.sofka.retofinal.doctor.values.DoctorId;
import org.sofka.retofinal.paciente.Paciente;
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.values.*;

import java.util.Set;

public class Quirofano extends AggregateEvent<QuirofanoId> {

    protected TipoCirugia tipoCirugia;
    protected Duracion duracion;
    protected Fecha fecha;
    protected Set<EspecialistaEntity> especialistas;
    protected Set<InstrumentoQuirurgicoEntity> instrumentosQuirurgicos;
    protected Set<MedicamentoEntity> medicamentos;
    protected DoctorId doctorId;
    protected PacienteId pacienteId;

    public Quirofano(QuirofanoId quirofanoId) {
        super(quirofanoId);
    }
}
