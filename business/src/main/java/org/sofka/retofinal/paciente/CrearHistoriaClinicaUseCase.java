package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.paciente.commands.CrearHistoriaClinicaCommand;

public class CrearHistoriaClinicaUseCase extends UseCase<RequestCommand<CrearHistoriaClinicaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearHistoriaClinicaCommand> crearHistoriaClinicaCommandRequestCommand) {
        var command = crearHistoriaClinicaCommandRequestCommand.getCommand();
        var paciente = Paciente.from(command.pacienteId(), repository().getEventsBy(command.pacienteId().value()));
        paciente.crearHistoriaClinica(command.historiaClinicaId(), command.pacienteId(), command.diagnostico());
        emit().onResponse(new ResponseEvents(paciente.getUncommittedChanges()));
    }
}
