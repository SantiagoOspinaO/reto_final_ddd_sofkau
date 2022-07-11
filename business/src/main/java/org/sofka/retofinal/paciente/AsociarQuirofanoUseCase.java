package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.paciente.commands.AsociarQuirofanoCommand;

public class AsociarQuirofanoUseCase extends UseCase<RequestCommand<AsociarQuirofanoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsociarQuirofanoCommand> asociarQuirofanoCommandRequestCommand) {
        var command = asociarQuirofanoCommandRequestCommand.getCommand();
        var paciente = Paciente.from(command.pacienteId(), repository().getEventsBy(command.pacienteId().value()));
        paciente.asociarQuirofano(command.quirofanoId(), command.pacienteId());
        emit().onResponse(new ResponseEvents(paciente.getUncommittedChanges()));
    }
}
