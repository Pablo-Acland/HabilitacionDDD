package co.com.Sofka.habilitacionDDD.domain.general;

import co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value.Asesoramiento;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class AppMovil implements ValueObject<Asesoramiento> {

    private final Asesoramiento value;

    public AppMovil(Asesoramiento value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String toString() {
        return "AppMovil{" +
                "value=" + value +
                '}';
    }

    @Override
    public Asesoramiento value() {
        return value;
    }
}
