package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ContratoIndefinido implements ValueObject<String> {

    private final String sueldo;
    private final String prestaciones;
    private final String veneficios;



    public ContratoIndefinido(String sueldo, String prestaciones, String veneficios) {
        this.sueldo = Objects.requireNonNull(sueldo);
        this.prestaciones = Objects.requireNonNull(prestaciones);
        this.veneficios = Objects.requireNonNull(veneficios);

        if(this.sueldo.isBlank() && this.prestaciones.isBlank() && this.prestaciones.isBlank()) //Que no sea vacio
            new IllegalArgumentException("El contrato no puede ser vacio.");

    }
    @Override
    public String value() {
        return toString();
    }

    @Override
    public String toString() {
        return "ContratoIndefinido{" +
                "sueldo='" + sueldo + '\'' +
                ", prestaciones='" + prestaciones + '\'' +
                ", veneficios='" + veneficios + '\'' +
                '}';
    }
}
