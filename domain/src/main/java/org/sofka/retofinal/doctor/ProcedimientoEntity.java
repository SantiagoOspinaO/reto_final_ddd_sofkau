package org.sofka.retofinal.doctor;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.doctor.values.Informacion;
import org.sofka.retofinal.doctor.values.Nota;
import org.sofka.retofinal.doctor.values.ProcedimientoId;

public class ProcedimientoEntity extends Entity<ProcedimientoId> {

    private Informacion informacion;
    private Nota nota;

    public ProcedimientoEntity(ProcedimientoId procedimientoId, Informacion informacion, Nota nota) {
        super(procedimientoId);
        this.informacion = informacion;
        this.nota = nota;
    }
}
