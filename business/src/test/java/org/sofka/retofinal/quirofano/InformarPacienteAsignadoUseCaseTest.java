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
import org.sofka.retofinal.paciente.values.PacienteId;
import org.sofka.retofinal.quirofano.events.AnestesiologoAsignado;
import org.sofka.retofinal.quirofano.events.PacienteAsignado;
import org.sofka.retofinal.quirofano.services.EmailService;
import org.sofka.retofinal.quirofano.values.AnestesiologoId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

@ExtendWith(MockitoExtension.class)
public class InformarPacienteAsignadoUseCaseTest {

    @Mock
    EmailService service;

    @InjectMocks
    InformarPacienteAsignadoUseCase useCase;

    @Test
    void enviarCorreo() {
        PacienteId pacienteId = PacienteId.of("54");
        QuirofanoId quirofanoId = QuirofanoId.of("97");
        var event = new PacienteAsignado(pacienteId, quirofanoId);
        Mockito.doNothing().when(service).enviarCorreo(QuirofanoId.of("97"), "Se le ha asignado un Paciente...");
        useCase.addServiceBuilder(new ServiceBuilder().addService(service));

        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow().getDomainEvents();

        Mockito.verify(service).enviarCorreo(QuirofanoId.of("97"), "Se le ha asignado un Paciente...");
        Assertions.assertEquals(0, events.size());
    }
}
