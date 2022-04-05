package co.com.Sofka.habilitacionDDD.domain.Usuario.event;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.sofka.domain.generic.DomainEvent;


public class DocumentoIngresado extends DomainEvent {

    private final IdUsuario idUsuario;
    private final String documentoIdentidad;

    public DocumentoIngresado(IdUsuario idUsuario, String documentoIdentidad) {
        super("usuario.documentoidentidadingresado");
        this.idUsuario = idUsuario;
        this.documentoIdentidad = documentoIdentidad;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

}
