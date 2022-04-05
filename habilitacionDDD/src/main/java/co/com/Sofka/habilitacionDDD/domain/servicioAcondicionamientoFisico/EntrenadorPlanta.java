package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico;

import co.com.Sofka.habilitacionDDD.domain.general.AppMovil;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.Asesoramiento;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.ContratoIndefinido;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.Horario;
import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.IdEntrenadorPlanta;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;
import java.util.Set;

public class EntrenadorPlanta extends Entity<IdEntrenadorPlanta> {

    private String nombre;
    private ContratoIndefinido contratoIndefinido;
    private Horario horario;
    private AppMovil appMovil;
    private Asesoramiento asesoramiento;

    public EntrenadorPlanta(IdEntrenadorPlanta entityId, String nombre, ContratoIndefinido contratoIndefinido, Horario horario, AppMovil appMovil, Asesoramiento asesoramiento) {
        super(entityId);
        this.nombre = nombre;
        this.contratoIndefinido = contratoIndefinido;
        this.horario = horario;
        this.appMovil = appMovil;
        this.asesoramiento = asesoramiento;
    }

    public String AsesorarUsuarioEnMaquinas(Asesoramiento asesoramiento){
        this.asesoramiento = Objects.requireNonNull(asesoramiento);
        return "El asesoramiento es:\n" + this.asesoramiento.toString();
    }
}
