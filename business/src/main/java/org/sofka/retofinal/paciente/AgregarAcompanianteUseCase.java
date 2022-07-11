package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.paciente.commands.AgregarAcompanianteCommand;
import org.sofka.retofinal.paciente.values.PacienteId;

public class AgregarAcompanianteUseCase extends UseCase<RequestCommand<AgregarAcompanianteCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarAcompanianteCommand> agregarAcompanianteCommandRequestCommand) {
        var command = agregarAcompanianteCommandRequestCommand.getCommand();
        var paciente = Paciente.from(command.pacienteId(), repository().getEventsBy(command.pacienteId().value()));
        paciente.agregarAcompaniante(command.acompanianteId(), command.informacionPersonal());
        emit().onResponse(new ResponseEvents(paciente.getUncommittedChanges()));
    }
}
