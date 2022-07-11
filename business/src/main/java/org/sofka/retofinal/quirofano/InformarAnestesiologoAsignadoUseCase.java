package org.sofka.retofinal.quirofano;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import org.sofka.retofinal.quirofano.events.AnestesiologoAsignado;
import org.sofka.retofinal.quirofano.services.EmailService;

import java.util.List;

public class InformarAnestesiologoAsignadoUseCase extends UseCase<TriggeredEvent<AnestesiologoAsignado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<AnestesiologoAsignado> anestesiologoAsignadoTriggeredEvent) {
        var event = anestesiologoAsignadoTriggeredEvent.getDomainEvent();
        var service = getService(EmailService.class).orElseThrow();

        String body = String.format("Se le ha asignado un Anestesiologo...", event.anestesiologoId());
        service.enviarCorreo(event.quirofanoId(), body);
        emit().onResponse(new ResponseEvents(List.of()));
    }
}
