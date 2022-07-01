package org.sofka.retofinal.doctor.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.*;

public class DoctorCreado extends DomainEvent {

    private final InformacionPersonal informacionPersonal;
    private final ProcedimientoId procedimientoId;
    private final Informacion informacion;
    private final Nota nota;
    private final EspecialidadId especialidadId;

    public DoctorCreado(InformacionPersonal informacionPersonal, ProcedimientoId procedimientoId, Informacion informacion, Nota nota, EspecialidadId especialidadId) {
        super("org.sofka.retofinal.DoctorCreado");
        this.informacionPersonal = informacionPersonal;
        this.procedimientoId = procedimientoId;
        this.informacion = informacion;
        this.nota = nota;
        this.especialidadId = especialidadId;
    }


    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }

    public ProcedimientoId procedimientoId() {
        return procedimientoId;
    }

    public Informacion informacion() {
        return informacion;
    }

    public Nota nota() {
        return nota;
    }

    public EspecialidadId especialidadId() {
        return especialidadId;
    }
}
