package org.sofka.retofinal.quirofano.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.doctor.values.InformacionPersonal;
import org.sofka.retofinal.quirofano.values.*;

public class CrearQuirofanoCommand extends Command {

    private final QuirofanoId quirofanoId;
    private final TipoCirugia tipoCirugia;
    private final Duracion duracion;
    private final Fecha fecha;
    private final AnestesiologoId anestesiologoId;
    private final InformacionPersonal informacionPersonal;

    public CrearQuirofanoCommand(QuirofanoId quirofanoId, TipoCirugia tipoCirugia, Duracion duracion, Fecha fecha, AnestesiologoId anestesiologoId, InformacionPersonal informacionPersonal) {
        this.quirofanoId = quirofanoId;
        this.tipoCirugia = tipoCirugia;
        this.duracion = duracion;
        this.fecha = fecha;
        this.anestesiologoId = anestesiologoId;
        this.informacionPersonal = informacionPersonal;
    }

    public QuirofanoId quirofanoId() {
        return quirofanoId;
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
