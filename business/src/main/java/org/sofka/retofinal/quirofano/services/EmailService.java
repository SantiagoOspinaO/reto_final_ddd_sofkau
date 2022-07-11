package org.sofka.retofinal.quirofano.services;

import org.sofka.retofinal.quirofano.values.QuirofanoId;

public interface EmailService {
    void enviarCorreo(QuirofanoId quirofanoId, String body);
}
