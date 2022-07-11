package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.paciente.commands.CrearPacienteCommand;

public class CrearPacienteUseCase extends UseCase<RequestCommand<CrearPacienteCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearPacienteCommand> crearPacienteCommandRequestCommand) {
        var command = crearPacienteCommandRequestCommand.getCommand();
        var paciente = new Paciente(command.pacienteId(), command.informacionPersonal(), command.historiaClinicaId(),
                command.diagnostico(), command.habitacionId(), command.numero(), command.ubicacion(), command.acompanianteId());
        emit().onResponse(new ResponseEvents(paciente.getUncommittedChanges()));
    }
}
