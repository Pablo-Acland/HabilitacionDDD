package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Proveedor implements ValueObject<String> {

    private final String direccion;
    private final String nombre;

    public Proveedor(String direccion, String nombre) {
        this.direccion = Objects.requireNonNull(direccion); //Que no sea nulo
        this.nombre = Objects.requireNonNull(nombre);
    }

    @Override
    public String value() {
        return "Es de: "+direccion+" y su nombre es: "+nombre;
    }
}
