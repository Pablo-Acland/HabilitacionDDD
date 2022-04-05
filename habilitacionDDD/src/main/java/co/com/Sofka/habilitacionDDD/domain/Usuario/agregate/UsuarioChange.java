package co.com.Sofka.habilitacionDDD.domain.Usuario.agregate;

import co.com.Sofka.habilitacionDDD.domain.Usuario.event.DocumentoIngresado;
import co.com.Sofka.habilitacionDDD.domain.Usuario.event.HuellaAgregada;
import co.com.Sofka.habilitacionDDD.domain.Usuario.event.UsuarioCreado;
import co.com.sofka.domain.generic.EventChange;

public class UsuarioChange extends EventChange {

    public UsuarioChange(Usuario usuario){

        apply((UsuarioCreado event) -> {
            usuario.nombre = event.getNombre();
            usuario.documentoIdentidad = event.getDocumentoIdentidad();
            usuario.huellaDactilar = event.getHuellaDactilar();
        });

        apply((DocumentoIngresado event)->{
            usuario.documentoIdentidad = event.getDocumentoIdentidad();
        });

        apply((HuellaAgregada event)-> {
            usuario.huellaDactilar = event.getHuellaDactilar();
        });

    }

}
