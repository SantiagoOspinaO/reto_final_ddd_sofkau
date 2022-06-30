package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.EnfermeraId;
import org.sofka.retofinal.doctor.values.EspecialidadId;
import org.sofka.retofinal.doctor.values.TarjetaProfesionalId;

public class DoctorCreado extends DomainEvent {

    private final EnfermeraId enfermeraId;
    private final TarjetaProfesionalId tarjetaProfesionalId;
    private final EspecialidadId especialidadId;

    public DoctorCreado(EnfermeraId enfermeraId, TarjetaProfesionalId tarjetaProfesionalId, EspecialidadId especialidadId) {
        super("org.sofka.retofinal.DoctorCreado");
        this.enfermeraId = enfermeraId;
        this.tarjetaProfesionalId = tarjetaProfesionalId;
        this.especialidadId = especialidadId;
    }

    public EnfermeraId getEnfermeraId() {
        return enfermeraId;
    }

    public TarjetaProfesionalId getTarjetaProfesionalId() {
        return tarjetaProfesionalId;
    }

    public EspecialidadId getEspecialidadId() {
        return especialidadId;
    }
}
