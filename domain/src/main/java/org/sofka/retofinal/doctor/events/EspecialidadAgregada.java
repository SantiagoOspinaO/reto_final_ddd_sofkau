package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.Descripcion;
import org.sofka.retofinal.doctor.values.EspecialidadId;

public class EspecialidadAgregada extends DomainEvent {

    private final EspecialidadId especialidadId;
    private final Descripcion descripcion;

    public EspecialidadAgregada(EspecialidadId especialidadId, Descripcion descripcion) {
        super("org.sofka.retofinal.EspecialidadAgregada");
        this.especialidadId = especialidadId;
        this.descripcion = descripcion;
    }
}
