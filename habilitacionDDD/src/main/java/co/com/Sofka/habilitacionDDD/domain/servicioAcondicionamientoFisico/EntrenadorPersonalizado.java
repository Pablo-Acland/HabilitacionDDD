package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico;

import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.Contrato;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.IdEntrenadorPersonalizado;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.Rutina;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class EntrenadorPersonalizado extends Entity<IdEntrenadorPersonalizado> {

    private String nombre;
    private Contrato contrato;
    private Rutina rutina;



    public EntrenadorPersonalizado(IdEntrenadorPersonalizado entityId, String nombre, Contrato contrato, Rutina rutina) {
        super(entityId);
        this.nombre = nombre;
        this.contrato = contrato;
        this.rutina = rutina;
    }

    public String AconsejarRutina(Rutina rutina){
        this.rutina = Objects.requireNonNull(rutina);
        return "la rutina se realiza asi:\n" + this.rutina.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Rutina getRutina() {
        return rutina;
    }
}
