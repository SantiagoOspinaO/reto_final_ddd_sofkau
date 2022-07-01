package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.*;

public class DoctorCreado extends DomainEvent {

    private final InformacionPersonal informacionPersonal;
    private final ProcedimientoId procedimientoId;
    private final Descripcion descripcion;
    private final Calificacion calificacion;
    private final EspecialidadId especialidadId;
    private final EnfermeraId enfermeraId;

    public DoctorCreado(InformacionPersonal informacionPersonal, ProcedimientoId procedimientoId,
                        Descripcion descripcion, Calificacion calificacion, EspecialidadId especialidadId, EnfermeraId enfermeraId) {
        super("org.sofka.retofinal.DoctorCreado");
        this.informacionPersonal = informacionPersonal;
        this.procedimientoId = procedimientoId;
        this.descripcion = descripcion;
        this.calificacion = calificacion;
        this.especialidadId = especialidadId;
        this.enfermeraId = enfermeraId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }

    public ProcedimientoId procedimientoId() {
        return procedimientoId;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Calificacion calificacion() {
        return calificacion;
    }

    public EspecialidadId especialidadId() {
        return especialidadId;
    }

    public EnfermeraId enfermeraId() {
        return enfermeraId;
    }
}
