package org.sofka.retofinal.doctor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.doctor.commands.AgregarEspecialidadCommand;

public class AgregarEspecialidadUseCase extends UseCase<RequestCommand<AgregarEspecialidadCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarEspecialidadCommand> agregarEspecialidadCommandRequestCommand) {
        var command = agregarEspecialidadCommandRequestCommand.getCommand();
        var doctor = Doctor.from(command.doctorId(), repository().getEventsBy(command.doctorId().value()));
        doctor.agregarEspecialidad(command.especialidadId(), command.descripcion());
        emit().onResponse(new ResponseEvents(doctor.getUncommittedChanges()));
    }
}
