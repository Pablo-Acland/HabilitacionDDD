package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.comands;

import co.com.Sofka.habilitacionDDD.domain.Usuario.value.IdUsuario;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.EntrenadorPersonalizado;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.EntrenadorPlanta;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.Maquina;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.IdSucursal;
import co.com.sofka.domain.generic.Command;

import java.util.Set;

public class CrarServicio extends Command {

    protected IdSucursal idSucursal;
    protected IdUsuario usuarioId;
    protected EntrenadorPlanta entrenadorPlanta;
    protected EntrenadorPersonalizado entrenadorPersonalizado;
    protected Set<Maquina> maquinas;

    public CrarServicio(IdSucursal idSucursal, IdUsuario idUsuario, EntrenadorPlanta entrenadorPlanta, EntrenadorPersonalizado entrenadorPersonalizado, Set<Maquina> maquinas) {
        this.idSucursal = idSucursal;
        this.usuarioId = idUsuario;
        this.entrenadorPlanta = entrenadorPlanta;
        this.entrenadorPersonalizado = entrenadorPersonalizado;
        this.maquinas = maquinas;
    }

    public IdSucursal getIdSucursal() {
        return idSucursal;
    }

    public IdUsuario getUsuarioId() {
        return usuarioId;
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
