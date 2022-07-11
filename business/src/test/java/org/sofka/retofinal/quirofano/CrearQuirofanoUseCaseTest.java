package org.sofka.retofinal.quirofano;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.quirofano.commands.CrearQuirofanoCommand;
import org.sofka.retofinal.quirofano.events.QuirofanoCreado;
import org.sofka.retofinal.quirofano.values.*;

@ExtendWith(MockitoExtension.class)
public class CrearQuirofanoUseCaseTest {

    @InjectMocks
    CrearQuirofanoUseCase useCase;

    @Test
    void creaQuirofano() {
        QuirofanoId quirofanoId = QuirofanoId.of("97");
        TipoCirugia tipoCirugia = new TipoCirugia("Tipo Cirugia");
        Duracion duracion = new Duracion("3h");
        Fecha fecha = new Fecha();
        AnestesiologoId anestesiologoId = AnestesiologoId.of("34");
        InformacionPersonal informacionPersonal = new InformacionPersonal("CC", 95646, "Anestesiologo", "63464649", "Bogota");
        var command = new CrearQuirofanoCommand(quirofanoId, tipoCirugia, duracion, fecha, anestesiologoId, informacionPersonal);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        //assert
        var event = (QuirofanoCreado)events.get(0);
        Assertions.assertEquals("34", event.anestesiologoId().value());
    }
}
