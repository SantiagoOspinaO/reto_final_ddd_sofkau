package org.sofka.retofinal.quirofano.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.quirofano.values.InstrumentoQuirurgicoId;
import org.sofka.retofinal.quirofano.values.Nombre;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsignarInstrumentoQuirurgicoCommand extends Command {

    private final QuirofanoId quirofanoId;
    private final InstrumentoQuirurgicoId instrumentoQuirurgicoId;
    private final Nombre nombre;

    public AsignarInstrumentoQuirurgicoCommand(QuirofanoId quirofanoId, InstrumentoQuirurgicoId instrumentoQuirurgicoId, Nombre nombre) {
        this.quirofanoId = quirofanoId;
        this.instrumentoQuirurgicoId = instrumentoQuirurgicoId;
        this.nombre = nombre;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
    }

    public InstrumentoQuirurgicoId instrumentoQuirurgicoId() {
        return instrumentoQuirurgicoId;
    }

    public Nombre nombre() {
        return nombre;
    }
}
