package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.Identity;

public class IdSucursal extends Identity {

    public IdSucursal(){}

    private IdSucursal(String id){super(id);}

    public static IdSucursal of (String id){return new IdSucursal(id);}
}
