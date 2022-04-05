package co.com.Sofka.habilitacionDDD.domain.Usuario.comands;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.Sofka.habilitacionDDD.domain.Usuario.value.TipoDocumento;
import co.com.sofka.domain.generic.Command;

public class CrearUsuario extends Command {

    private final IdUsuario idUsuario;
    private final String nombre;
    private final String documentoIdentidad;
    private final String huellaDactilar;
    protected final TipoDocumento tipoDocumento;




    public CrearUsuario(IdUsuario idUsuario, String nombre, String documentoIdentidad, String huellaDactilar, TipoDocumento tipoDocumento) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.huellaDactilar = huellaDactilar;
        this.tipoDocumento = tipoDocumento;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getHuellaDactilar() {
        return huellaDactilar;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

}
