package org.sofka.retofinal.paciente.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.paciente.values.Diagnostico;
import org.sofka.retofinal.paciente.values.HistoriaClinicaId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class HistoriaClinicaCreada extends DomainEvent {
    private final HistoriaClinicaId historiaClinicaId;
    private final PacienteId pacienteId;
    private final Diagnostico diagnostico;

    public HistoriaClinicaCreada(HistoriaClinicaId historiaClinicaId, PacienteId pacienteId, Diagnostico diagnostico) {
        super("org.sofka.retofinal.HistoriaClinicaCreada");
        this.historiaClinicaId = historiaClinicaId;
        this.pacienteId = pacienteId;
        this.diagnostico = diagnostico;
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
}
