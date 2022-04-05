package co.com.Sofka.habilitacionDDD.domain.Usuario.value;

import co.com.sofka.domain.generic.Identity;

public class IdUsuario extends Identity {
    public IdUsuario(){}

    //Constructor
    private IdUsuario(String id){
        super(id);
    }

    //Metodo que devuelve el ID
    public static IdUsuario of(String id){
        return new IdUsuario(id);
    }
}
