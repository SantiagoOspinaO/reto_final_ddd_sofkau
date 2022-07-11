package org.sofka.retofinal.doctor;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.doctor.commands.CrearDoctorCommand;
import org.sofka.retofinal.doctor.values.DoctorId;

public class CrearDoctorUseCase extends UseCase<RequestCommand<CrearDoctorCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearDoctorCommand> crearDoctorCommandRequestCommand) {
        var command = crearDoctorCommandRequestCommand.getCommand();
        var doctor = new Doctor(new DoctorId(), command.informacionPersonal(), command.procedimientoId(),
                command.descripcion(), command.calificacion(), command.especialidadId(), command.enfermeraId());
        emit().onResponse(new ResponseEvents(doctor.getUncommittedChanges()));
    }
}
