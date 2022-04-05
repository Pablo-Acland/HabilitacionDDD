package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.event.ServicioCreado;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.IdEntrenadorPersonalizado;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.IdSucursal;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class ServicioAcondicionamientoFisico extends AggregateEvent<IdSucursal> {

    protected IdSucursal idSucursal;
    protected IdUsuario idUsuario;
    protected EntrenadorPlanta entrenadorPlanta;
    protected EntrenadorPersonalizado entrenadorPersonalizado;
    protected Set<Maquina> maquinas;

    public ServicioAcondicionamientoFisico(IdSucursal entityId, IdUsuario usuarioId, EntrenadorPlanta entrenadorPlanta,EntrenadorPersonalizado entrenadorPersonalizado,Set<Maquina> maquinas) {
        super(entityId);
        appendChange(new ServicioCreado(usuarioId, entrenadorPlanta, entrenadorPersonalizado,maquinas)).apply();
    }

    private ServicioAcondicionamientoFisico(IdSucursal entityId) {
        super(entityId);
        subscribe(new ServicioChange(this));
    }

    public static ServicioAcondicionamientoFisico from(IdSucursal idSucursal, List<DomainEvent> events) {
        var Servicio = new ServicioAcondicionamientoFisico(idSucursal);
        events.forEach(Servicio::applyEvent);
        return Servicio;
    }




    public IdSucursal gymId() {
        return idSucursal;
    }

    public IdUsuario usuarioId() {
        return idUsuario;
    }

    public EntrenadorPlanta entrenadorPlanta() {
        return entrenadorPlanta;
    }

    public EntrenadorPersonalizado entrenadorPersonalizado() {
        return entrenadorPersonalizado;
    }

    public Set<Maquina> maquinas() {
        return maquinas;
    }



}
