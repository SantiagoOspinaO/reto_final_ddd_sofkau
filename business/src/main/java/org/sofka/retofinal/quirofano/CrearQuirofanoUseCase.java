package org.sofka.retofinal.quirofano;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import org.sofka.retofinal.quirofano.commands.CrearQuirofanoCommand;

public class CrearQuirofanoUseCase extends UseCase<RequestCommand<CrearQuirofanoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearQuirofanoCommand> crearQuirofanoCommandRequestCommand) {
        var command = crearQuirofanoCommandRequestCommand.getCommand();
        var quirofano = new Quirofano(command.quirofanoId(), command.tipoCirugia(), command.duracion(), command.fecha(),
                command.anestesiologoId(), command.informacionPersonal());
        emit().onResponse(new ResponseEvents(quirofano.getUncommittedChanges()));
    }
}
