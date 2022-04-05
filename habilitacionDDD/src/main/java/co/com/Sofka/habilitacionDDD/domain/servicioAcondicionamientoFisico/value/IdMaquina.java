package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.Identity;

public class IdMaquina extends Identity {

    public IdMaquina(){}

    private IdMaquina(String id){
        super(id);
    }

    public static IdMaquina of(String id){
        return new IdMaquina(id);
    }

}
