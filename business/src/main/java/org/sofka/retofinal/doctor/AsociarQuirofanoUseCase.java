package org.sofka.retofinal.doctor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.doctor.commands.AsociarQuirofanoCommand;

public class AsociarQuirofanoUseCase extends UseCase<RequestCommand<AsociarQuirofanoCommand>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AsociarQuirofanoCommand> asociarQuirofanoCommandRequestCommand) {
        var command = asociarQuirofanoCommandRequestCommand.getCommand();
        var doctor = Doctor.from(command.doctorId(), repository().getEventsBy(command.doctorId().value()));
        doctor.asociarQuirofano(command.quirofanoId(), command.doctorId());
        emit().onResponse(new ResponseEvents(doctor.getUncommittedChanges()));
    }
}
