package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.paciente.commands.AsociarHabitacionCommand;

public class AsociarHabitacionUseCase extends UseCase<RequestCommand<AsociarHabitacionCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsociarHabitacionCommand> asociarHabitacionCommandRequestCommand) {
        var command = asociarHabitacionCommandRequestCommand.getCommand();
        var paciente = Paciente.from(command.pacienteId(), repository().getEventsBy(command.pacienteId().value()));
        paciente.asociarHabitacion(command.habitacionId(), command.pacienteId(), command.numero(), command.ubicacion());
        emit().onResponse(new ResponseEvents(paciente.getUncommittedChanges()));
    }
}
