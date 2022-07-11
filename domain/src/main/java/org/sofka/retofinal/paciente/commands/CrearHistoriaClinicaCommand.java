package org.sofka.retofinal.paciente.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.paciente.values.Diagnostico;
import org.sofka.retofinal.paciente.values.HistoriaClinicaId;
import org.sofka.retofinal.paciente.values.PacienteId;

public class CrearHistoriaClinicaCommand extends Command {

    private final HistoriaClinicaId historiaClinicaId;
    private final PacienteId pacienteId;
    private final Diagnostico diagnostico;

    public CrearHistoriaClinicaCommand(HistoriaClinicaId historiaClinicaId, PacienteId pacienteId, Diagnostico diagnostico) {
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
