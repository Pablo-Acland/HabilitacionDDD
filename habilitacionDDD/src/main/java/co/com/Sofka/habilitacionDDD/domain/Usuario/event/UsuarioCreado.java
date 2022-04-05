package co.com.Sofka.habilitacionDDD.domain.Usuario.event;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.TipoDocumento;
import co.com.sofka.domain.generic.DomainEvent;


public class UsuarioCreado extends DomainEvent {

    private final String nombre;
    private final String documentoIdentidad;
    private final String huellaDactilar;
    protected final TipoDocumento tipoDocumento;



    public UsuarioCreado(String nombre, String documentoIdentidad, String huellaDactilar, TipoDocumento tipoDocumento) {
            super("usuario.usuariocreado");
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.huellaDactilar = huellaDactilar;
        this.tipoDocumento = tipoDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public String getNombre() {
        return nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String  getHuellaDactilar() {
        return huellaDactilar;
    }
}
