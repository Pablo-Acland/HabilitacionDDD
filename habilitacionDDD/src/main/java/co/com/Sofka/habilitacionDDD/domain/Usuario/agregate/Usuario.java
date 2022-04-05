package co.com.Sofka.habilitacionDDD.domain.Usuario.agregate;

import co.com.Sofka.habilitacionDDD.domain.Usuario.event.DocumentoIngresado;
import co.com.Sofka.habilitacionDDD.domain.Usuario.event.HuellaAgregada;
import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.Sofka.habilitacionDDD.domain.Usuario.value.TipoDocumento;
import co.com.Sofka.habilitacionDDD.domain.Usuario.event.UsuarioCreado;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;

public class Usuario extends AggregateEvent<IdUsuario> {

    protected String documentoIdentidad;
    protected TipoDocumento tipoDocumento;
    protected String huellaDactilar;
    protected String nombre;

    public Usuario(IdUsuario idEntity, String documentoIdentidad, TipoDocumento tipoDocumento, String huellaDactilar, String nombre) {
        super(idEntity);

        appendChange(new UsuarioCreado(nombre,documentoIdentidad,huellaDactilar, tipoDocumento)).apply();
    }

    private Usuario(IdUsuario idEntity) {
        super(idEntity);

        subscribe(new UsuarioChange(this));
    }

    public static Usuario from(IdUsuario idUsuario, List<DomainEvent> events) {
        var usuario = new Usuario(idUsuario);
        events.forEach(usuario::applyEvent);
        return usuario;
    }

    public void ingresarDocumento(IdUsuario idEntity, String documentoIdentidad){


        Objects.requireNonNull(idEntity);
        Objects.requireNonNull(documentoIdentidad);

        appendChange(new DocumentoIngresado(idEntity,documentoIdentidad)).apply();
    }

    public void agregarHuellaDactilar(IdUsuario idEntity, String huellaDactilar){

        Objects.requireNonNull(idEntity);
        Objects.requireNonNull(huellaDactilar);

        appendChange(new HuellaAgregada(idEntity,huellaDactilar)).apply();
    }

    public String documentoIdentidad() {
        return documentoIdentidad;
    }

    public TipoDocumento tipoDocumento() {
        return tipoDocumento;
    }

    public String huellaDactilar() {
        return huellaDactilar;
    }

    public String nombre() {
        return nombre;
    }
}
