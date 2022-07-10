package org.sofka.retofinal.quirofano.entities;

import co.com.sofka.domain.generic.Entity;
import org.sofka.retofinal.quirofano.values.MedicamentoId;
import org.sofka.retofinal.quirofano.values.Nombre;
import org.sofka.retofinal.quirofano.values.NumeroSerie;

import java.util.Objects;

public class MedicamentoEntity extends Entity<MedicamentoId> {

    private NumeroSerie numeroSerie;
    private Nombre nombre;

    public MedicamentoEntity(MedicamentoId medicamentoId, NumeroSerie numeroSerie, Nombre nombre) {
        super(medicamentoId);
        this.numeroSerie = numeroSerie;
        this.nombre = nombre;
    }

    public void actualizarNumeroSerie(NumeroSerie numeroSerie) {
        this.numeroSerie = Objects.requireNonNull(numeroSerie);
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }
}
