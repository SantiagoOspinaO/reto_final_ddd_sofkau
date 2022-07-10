package org.sofka.retofinal.quirofano.commands;

import co.com.sofka.domain.generic.Command;
import org.sofka.retofinal.quirofano.values.AnestesiologoId;
import org.sofka.retofinal.quirofano.values.QuirofanoId;

public class AsignarAnestesiologoCommand extends Command {

    private final QuirofanoId quirofanoId;
    private final AnestesiologoId anestesiologoId;

    public AsignarAnestesiologoCommand(QuirofanoId quirofanoId, AnestesiologoId anestesiologoId) {
        this.quirofanoId = quirofanoId;
        this.anestesiologoId = anestesiologoId;
    }

    public QuirofanoId getQuirofanoId() {
        return quirofanoId;
    }

    public AnestesiologoId getAnestesiologoId() {
        return anestesiologoId;
    }
}
