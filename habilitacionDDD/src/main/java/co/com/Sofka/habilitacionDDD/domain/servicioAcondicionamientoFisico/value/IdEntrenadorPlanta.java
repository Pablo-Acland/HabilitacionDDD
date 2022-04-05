package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.Identity;

public class IdEntrenadorPlanta extends Identity {

    public IdEntrenadorPlanta(){}

    private IdEntrenadorPlanta(String id){
        super(id);
    }


    public static IdEntrenadorPlanta of(String id){
        return new IdEntrenadorPlanta(id);
    }

}
