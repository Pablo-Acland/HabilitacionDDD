package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico;

import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.event.ServicioCreado;
import co.com.sofka.domain.generic.EventChange;

public class ServicioChange extends EventChange {

    public ServicioChange(ServicioAcondicionamientoFisico servicio) {

        apply((ServicioCreado event) -> {
            servicio.idUsuario = event.getIdUsuario();
            servicio.entrenadorPersonalizado = event.getEntrenadorPersonalizado();
            servicio.entrenadorPlanta = event.getEntrenadorPlanta();
            servicio.maquinas = event.getMaquinas();
        });

    }
}
