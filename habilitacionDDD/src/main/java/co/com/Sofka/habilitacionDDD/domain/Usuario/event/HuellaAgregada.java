package co.com.Sofka.habilitacionDDD.domain.Usuario.event;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.sofka.domain.generic.DomainEvent;

public class HuellaAgregada extends DomainEvent {

    private final IdUsuario idUsuario;
    private final String huellaDactilar;

    public HuellaAgregada(IdUsuario idUsuario, String huellaDactilar) {
        super("usuario.HuellaAgregada");
        this.idUsuario = idUsuario;
        this.huellaDactilar = huellaDactilar;
    }

    //Getters
    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public String getHuellaDactilar() {
        return huellaDactilar;
    }

}
