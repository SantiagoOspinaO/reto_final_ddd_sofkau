package org.sofka.retofinal.quirofano;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import org.sofka.retofinal.quirofano.events.PacienteAsignado;
import org.sofka.retofinal.quirofano.services.EmailService;

import java.util.List;

public class InformarPacienteAsignadoUseCase extends UseCase<TriggeredEvent<PacienteAsignado>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<PacienteAsignado> pacienteAsignadoTriggeredEvent) {
        var event = pacienteAsignadoTriggeredEvent.getDomainEvent();
        var service = getService(EmailService.class).orElseThrow();

        String body = String.format("Se le ha asignado un Paciente...", event.pacienteId());
        service.enviarCorreo(event.quirofanoId(), body);
        emit().onResponse(new ResponseEvents(List.of()));
    }
}
