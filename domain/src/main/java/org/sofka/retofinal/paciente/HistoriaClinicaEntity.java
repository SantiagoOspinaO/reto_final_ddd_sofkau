package org.sofka.retofinal.paciente;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.paciente.values.Diagnostico;
import org.sofka.retofinal.paciente.values.HistoriaClinicaId;
import org.sofka.retofinal.paciente.values.PacienteId;

import java.util.Objects;

public class HistoriaClinicaEntity extends Entity<HistoriaClinicaId> {

    private PacienteId pacienteId;
    private Diagnostico diagnostico;

    public HistoriaClinicaEntity(HistoriaClinicaId historiaClinicaId, PacienteId pacienteId, Diagnostico diagnostico) {
        super(historiaClinicaId);
        this.pacienteId = pacienteId;
        this.diagnostico = diagnostico;
    }

    public void actualizarDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = Objects.requireNonNull(diagnostico);
    }
}
