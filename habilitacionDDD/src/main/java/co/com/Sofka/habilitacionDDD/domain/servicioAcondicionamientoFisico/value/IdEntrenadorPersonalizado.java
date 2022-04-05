package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.Identity;

public class IdEntrenadorPersonalizado extends Identity {

    public IdEntrenadorPersonalizado(){}


    private IdEntrenadorPersonalizado(String id){
        super(id);
    }


    public static IdEntrenadorPersonalizado of(String id){
        return new IdEntrenadorPersonalizado(id);
    }


}
