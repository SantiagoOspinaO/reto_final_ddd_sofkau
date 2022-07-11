package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.commands.AsociarQuirofanoCommand;
import org.sofka.retofinal.paciente.events.PacienteCreado;
import org.sofka.retofinal.paciente.events.QuirofanoAsociado;
import org.sofka.retofinal.paciente.values.*;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AsociarQuirofanoUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AsociarQuirofanoUseCase useCase;

    @Test
    void asociarQuirofano() {
        //arrange
        QuirofanoId quirofanoId = QuirofanoId.of("97");
        PacienteId pacienteId = PacienteId.of("54");
        var command = new AsociarQuirofanoCommand(quirofanoId, pacienteId);

        when(repository.getEventsBy(pacienteId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (QuirofanoAsociado)events.get(0);
        Assertions.assertEquals("54", event.pacienteId().value());
    }

    private List<DomainEvent> history() {
        PacienteId pacienteId = PacienteId.of("54");
        InformacionPersonal informacionPersonal = new InformacionPersonal("CC", 6497, "Paciente", "65974", "Cabeceras");
        HistoriaClinicaId historiaClinicaId = HistoriaClinicaId.of("6568");
        Diagnostico diagnostico = new Diagnostico("Diagnostico");
        HabitacionId habitacionId = HabitacionId.of("98");
        Numero numero = new Numero(9);
        Ubicacion ubicacion = new Ubicacion("Ubicacion");
        AcompanianteId acompanianteId = AcompanianteId.of("21");
        return List.of(
                new PacienteCreado(informacionPersonal, historiaClinicaId, pacienteId, diagnostico, habitacionId, numero, ubicacion, acompanianteId)
        );
    }
}
