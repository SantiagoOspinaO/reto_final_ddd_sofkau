package org.sofka.retofinal.quirofano.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.quirofano.values.MedicamentoId;
import org.sofka.retofinal.quirofano.values.Nombre;
import org.sofka.retofinal.quirofano.values.NumeroSerie;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsignarMedicamentoCommand extends Command {

    private final QuirofanoId quirofanoId;
    private final MedicamentoId medicamentoId;
    private final NumeroSerie numeroSerie;
    private final Nombre nombre;

    public AsignarMedicamentoCommand(QuirofanoId quirofanoId, MedicamentoId medicamentoId, NumeroSerie numeroSerie, Nombre nombre) {
        this.quirofanoId = quirofanoId;
        this.medicamentoId = medicamentoId;
        this.numeroSerie = numeroSerie;
        this.nombre = nombre;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
    }

    public MedicamentoId medicamentoId() {
        return medicamentoId;
    }

    public NumeroSerie numeroSerie() {
        return numeroSerie;
    }

    public Nombre nombre() {
        return nombre;
    }
}
