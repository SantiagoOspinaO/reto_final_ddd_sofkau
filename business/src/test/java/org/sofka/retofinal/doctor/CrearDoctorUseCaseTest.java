package org.sofka.retofinal.doctor;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.sofka.retofinal.doctor.commands.CrearDoctorCommand;
import org.sofka.retofinal.doctor.events.DoctorCreado;
import org.sofka.retofinal.doctor.values.*;

@ExtendWith(MockitoExtension.class)
class CrearDoctorUseCaseTest {

    @InjectMocks
    CrearDoctorUseCase useCase;

    @Test
     void crearDoctor() {
        //arrange
        DoctorId doctorId = DoctorId.of("31644");
        InformacionPersonal informacionPersonal = new InformacionPersonal("CC", 646545, "Carlos",
                "546646", "Calle 54");
        ProcedimientoId procedimientoId = ProcedimientoId.of("132");
        Descripcion descripcion = new Descripcion("Descripcion");
        Calificacion calificacion = new Calificacion(5.0);
        EspecialidadId especialidadId = EspecialidadId.of("656");
        EnfermeraId enfermeraId = EnfermeraId.of("878");
        var command = new CrearDoctorCommand(doctorId, informacionPersonal, procedimientoId, descripcion, calificacion, especialidadId, enfermeraId);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var doctorCreado = (DoctorCreado)events.get(0);
        Assertions.assertEquals(5.0, doctorCreado.calificacion().value());
    }
}
