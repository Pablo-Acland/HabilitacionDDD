package co.com.Sofka.habilitacionDDD.domain.Usuario.comands;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.sofka.domain.generic.Command;

public class IngresarDocumento extends Command {

    private final IdUsuario idUsuario;
    private final String documentoIdentidad;


    public IngresarDocumento(IdUsuario idUsuario, String documentoIdentidad) {
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
