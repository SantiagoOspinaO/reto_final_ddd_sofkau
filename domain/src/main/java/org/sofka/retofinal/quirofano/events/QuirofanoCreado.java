package org.sofka.retofinal.quirofano.events;

import co.com.sofka.domain.generic.DomainEvent;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.quirofano.values.*;

public class QuirofanoCreado extends DomainEvent {

    private final TipoCirugia tipoCirugia;
    private final Duracion duracion;
    private final Fecha fecha;
    private final AnestesiologoId anestesiologoId;
    private final InformacionPersonal informacionPersonal;

    public QuirofanoCreado(TipoCirugia tipoCirugia, Duracion duracion, Fecha fecha, AnestesiologoId anestesiologoId, InformacionPersonal informacionPersonal) {
        super("org.sofka.retofinal.QuirofanoCreado");
        this.tipoCirugia = tipoCirugia;
        this.duracion = duracion;
        this.fecha = fecha;
        this.anestesiologoId = anestesiologoId;
        this.informacionPersonal = informacionPersonal;
    }


    public TipoCirugia tipoCirugia() {
        return tipoCirugia;
    }

    public Duracion duracion() {
        return duracion;
    }

    public Fecha fecha() {
        return fecha;
    }

    public AnestesiologoId anestesiologoId() {
        return anestesiologoId;
    }

    public InformacionPersonal informacionPersonal() {
        return informacionPersonal;
    }
}
