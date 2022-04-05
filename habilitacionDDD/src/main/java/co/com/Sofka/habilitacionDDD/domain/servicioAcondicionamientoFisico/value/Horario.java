package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Horario implements ValueObject<String> {

    private final Date entrada;
    private final Date salida;

    public Horario(Date entrada, Date salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "entrada=" + entrada +
                ", salida=" + salida +
                '}';
    }

    @Override
    public String value() {
        return toString();
    }
}
