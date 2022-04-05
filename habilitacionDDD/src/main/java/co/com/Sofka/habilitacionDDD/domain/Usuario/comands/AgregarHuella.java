package co.com.Sofka.habilitacionDDD.domain.Usuario.comands;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.sofka.domain.generic.Command;

public class AgregarHuella extends Command {

    private final IdUsuario idUsuario;
    private final String huellaDactilar;


    public AgregarHuella(IdUsuario usuarioId, String huellaDactilar) {
        this.idUsuario = usuarioId;
        this.huellaDactilar = huellaDactilar;
    }


    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public String getHuellaDactilar() {
        return huellaDactilar;
    }

}
