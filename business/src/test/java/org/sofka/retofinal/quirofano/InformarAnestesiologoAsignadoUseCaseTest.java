package org.sofka.retofinal.quirofano;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.retofinal.quirofano.events.AnestesiologoAsignado;
import org.sofka.retofinal.quirofano.services.EmailService;
import org.sofka.retofinal.quirofano.values.AnestesiologoId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

@ExtendWith(MockitoExtension.class)
class InformarAnestesiologoAsignadoUseCaseTest {

    @Mock
    EmailService service;

    @InjectMocks
    InformarAnestesiologoAsignadoUseCase useCase;

    @Test
    void enviarCorreo() {
        AnestesiologoId anestesiologoId = AnestesiologoId.of("65");
        QuirofanoId quirofanoId = QuirofanoId.of("97");
        var event = new AnestesiologoAsignado(anestesiologoId, quirofanoId);
        Mockito.doNothing().when(service).enviarCorreo(QuirofanoId.of("97"), "Se le ha asignado un Anestesiologo...");
        useCase.addServiceBuilder(new ServiceBuilder().addService(service));

        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow().getDomainEvents();

        Mockito.verify(service).enviarCorreo(QuirofanoId.of("97"), "Se le ha asignado un Anestesiologo...");
        Assertions.assertEquals(0, events.size());
    }

}
