package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico;

import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.IdMaquina;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.Proveedor;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.TipoMaquina;
import co.com.sofka.domain.generic.Entity;

public class Maquina extends Entity<IdMaquina> {

    private Proveedor proveedor;
    private TipoMaquina tipoMaquina;


    public Maquina(IdMaquina entityId, TipoMaquina tipoMaquina, Proveedor proveedor) {
        super(entityId);
        this.tipoMaquina= tipoMaquina;
        this.proveedor= proveedor;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public TipoMaquina getTipoMaquina() {
        return tipoMaquina;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "proveedor=" + proveedor +
                ", tipoMaquina=" + tipoMaquina +
                ", entityId=" + entityId +
                '}';
    }
}
