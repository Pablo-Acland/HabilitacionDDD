package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.event;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.EntrenadorPersonalizado;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.EntrenadorPlanta;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.Maquina;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class ServicioCreado extends DomainEvent {

    protected IdUsuario idUsuario;
    protected EntrenadorPlanta entrenadorPlanta;
    protected EntrenadorPersonalizado entrenadorPersonalizado;
    protected Set<Maquina> maquinas;

    public ServicioCreado(IdUsuario idUsuario, EntrenadorPlanta entrenadorPlanta, EntrenadorPersonalizado entrenadorPersonalizado, Set<Maquina> maquinas) {
        super("sofka.gym.gymcreado");
        this.idUsuario = idUsuario;
        this.entrenadorPlanta = entrenadorPlanta;
        this.entrenadorPersonalizado = entrenadorPersonalizado;
        this.maquinas = maquinas;
    }

    public IdUsuario getIdUsuario() {
        return idUsuario;
    }

    public EntrenadorPlanta getEntrenadorPlanta() {
        return entrenadorPlanta;
    }

    public EntrenadorPersonalizado getEntrenadorPersonalizado() {
        return entrenadorPersonalizado;
    }

    public Set<Maquina> getMaquinas() {
        return maquinas;
    }
}
