package org.sofka.retofinal.doctor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.doctor.commands.AgregarEnfermeraCommand;

public class AgregarEnfermeraUseCase extends UseCase<RequestCommand<AgregarEnfermeraCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarEnfermeraCommand> agregarEnfermeraCommandRequestCommand) {
        var command = agregarEnfermeraCommandRequestCommand.getCommand();
        var doctor = Doctor.from(command.doctorId(), repository().getEventsBy(command.doctorId().value()));
        doctor.agregarEnfermera(command.enfermeraId(), command.informacionPersonal());
        emit().onResponse(new ResponseEvents(doctor.getUncommittedChanges()));
    }
}
