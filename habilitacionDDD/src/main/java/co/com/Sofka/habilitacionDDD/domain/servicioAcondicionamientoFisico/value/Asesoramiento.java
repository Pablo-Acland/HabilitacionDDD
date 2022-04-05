package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.ValueObject;

public class Asesoramiento implements ValueObject<String> {

    private final String postura;
    private final String ejercicio;
    private final String maquina;

    public Asesoramiento(String postura, String ejercicio, String maquina) {
        this.postura = postura;
        this.ejercicio = ejercicio;
        this.maquina = maquina;
    }

    @Override
    public String toString() {
        return "Asesoramiento{" +
                "postura='" + postura + '\'' +
                ", ejercicio='" + ejercicio + '\'' +
                ", maquina='" + maquina + '\'' +
                '}';
    }

    @Override
    public String value() {
        return toString();
    }
}
