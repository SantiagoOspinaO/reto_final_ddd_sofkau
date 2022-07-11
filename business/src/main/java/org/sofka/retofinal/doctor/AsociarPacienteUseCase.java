package org.sofka.retofinal.doctor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.doctor.commands.AsociarPacienteCommand;

public class AsociarPacienteUseCase extends UseCase<RequestCommand<AsociarPacienteCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AsociarPacienteCommand> asociarPacienteCommandRequestCommand) {
        var command = asociarPacienteCommandRequestCommand.getCommand();
        var doctor = Doctor.from(command.doctorId(), repository().getEventsBy(command.doctorId().value()));
        doctor.asociarPaciente(command.pacienteId(), command.doctorId());
        emit().onResponse(new ResponseEvents(doctor.getUncommittedChanges()));
    }
}
