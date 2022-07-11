package org.sofka.retofinal.doctor;

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
import org.sofka.retofinal.doctor.commands.AsociarPacienteCommand;
import org.sofka.retofinal.doctor.events.DoctorCreado;
import org.sofka.retofinal.doctor.events.PacienteAsociado;
import org.sofka.retofinal.doctor.values.*;
import org.sofka.retofinal.paciente.values.PacienteId;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AsociarPacienteUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @InjectMocks
    AsociarPacienteUseCase useCase;

    @Test
    void asociarPaciente() {
        //arrange
        PacienteId pacienteId = PacienteId.of("54");
        DoctorId doctorId = DoctorId.of("51");
        var command = new AsociarPacienteCommand(pacienteId, doctorId);

        when(repository.getEventsBy(doctorId.value())).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asert
        var event = (PacienteAsociado)events.get(0);
        Assertions.assertEquals("51", event.doctorId().value());
    }

    private List<DomainEvent> history() {
        InformacionPersonal informacionPersonal = new InformacionPersonal("CC", 646545, "Carlos",
                "546646", "Calle 54");
        ProcedimientoId procedimientoId = ProcedimientoId.of("132");
        Descripcion descripcion = new Descripcion("Descripcion");
        Calificacion calificacion = new Calificacion(5.0);
        EspecialidadId especialidadId = EspecialidadId.of("656");
        EnfermeraId enfermeraId = EnfermeraId.of("878");

        return List.of(
                new DoctorCreado(informacionPersonal, procedimientoId, descripcion, calificacion, especialidadId, enfermeraId)
        );
    }
}
