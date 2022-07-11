package org.sofka.retofinal.paciente;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.paciente.commands.CrearPacienteCommand;
import org.sofka.retofinal.paciente.events.PacienteCreado;
import org.sofka.retofinal.paciente.values.*;

@ExtendWith(MockitoExtension.class)
public class CrearPacienteUseCaseTest {

    @InjectMocks
    CrearPacienteUseCase useCase;

    @Test
    void crearPaciente() {
        //arrange
        PacienteId pacienteId = PacienteId.of("54");
        InformacionPersonal informacionPersonal = new InformacionPersonal("CC", 6497, "Paciente", "65974", "Cabeceras");
        HistoriaClinicaId historiaClinicaId = HistoriaClinicaId.of("6568");
        Diagnostico diagnostico = new Diagnostico("Diagnostico");
        HabitacionId habitacionId = HabitacionId.of("98");
        Numero numero = new Numero(9);
        Ubicacion ubicacion = new Ubicacion("Ubicacion");
        AcompanianteId acompanianteId = AcompanianteId.of("21");
        var command = new CrearPacienteCommand(pacienteId, informacionPersonal, historiaClinicaId, diagnostico, habitacionId, numero, ubicacion, acompanianteId);

        //act
        var events = UseCaseHandler
                .getInstance().syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asssert
        var event = (PacienteCreado)events.get(0);
        Assertions.assertEquals("54", event.pacienteId().value());
    }
}
