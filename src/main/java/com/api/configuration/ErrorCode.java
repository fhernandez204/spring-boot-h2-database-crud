package com.api.configuration;

public enum ErrorCode {

    INTERNAL_ERROR(100, "Error interno del servidor"),
    REST_CLIENT_TIMEOUT(101, "Timeout de cliente rest"),
    CLIENT_NOT_FOUND(102, "No se encontro el cliente"),
    WEB_CLIENT_GENERIC(103, "Error del Web Client"),
    EMPTY_RUT(104,"El rut no puede ser vacio"),
    DATA_TO_DECRYPT_TOO_SHORT(105, "Los datos a desencriptar son muy cortos"),
    DATA_TO_DECRYPT_CANT_BE_NULL_ERROR(106, "Los datos a desencriptar no pueden ser null"),
    BAD_REQUEST(107, "Error en la solicitud"),
    BAD_LOCK(108, "No se puedo realizar el bloqueo"),
    BAD_CARD_REISSUE(109, "Tarjeta no apta para reemision"),
    BAD_REISSUE(110, "No se pudo reemitir la tarjeta"),
    SERVICE_UNAVAILABLE(111, "El servicio rest no esta disponible"),
    BAD_ID(104,"El ID no puede ser igual a Cero o Negativo");

    private final int value;
    private final String reasonPhrase;

    ErrorCode(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int value() {
        return this.value;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }
}
