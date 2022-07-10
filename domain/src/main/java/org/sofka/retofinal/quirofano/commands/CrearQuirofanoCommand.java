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

    public QuirofanoId getQuirofanoId() {
        return quirofanoId;
    }

    public TipoCirugia getTipoCirugia() {
        return tipoCirugia;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public AnestesiologoId getAnestesiologoId() {
        return anestesiologoId;
    }

    public InformacionPersonal getInformacionPersonal() {
        return informacionPersonal;
    }
}
