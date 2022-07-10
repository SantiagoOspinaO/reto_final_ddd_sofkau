package org.sofka.retofinal.quirofano.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.quirofano.values.MedicamentoId;
import org.sofka.retofinal.quirofano.values.Nombre;
import org.sofka.retofinal.quirofano.values.NumeroSerie;

public class MedicamentoAsignado extends DomainEvent {

    private final MedicamentoId medicamentoId;
    private final NumeroSerie numeroSerie;
    private final Nombre nombre;

    public MedicamentoAsignado(MedicamentoId medicamentoId, NumeroSerie numeroSerie, Nombre nombre) {
        super("org.sofka.retofinal.MedicamentoAsignado");
        this.medicamentoId = medicamentoId;
        this.numeroSerie = numeroSerie;
        this.nombre = nombre;
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
