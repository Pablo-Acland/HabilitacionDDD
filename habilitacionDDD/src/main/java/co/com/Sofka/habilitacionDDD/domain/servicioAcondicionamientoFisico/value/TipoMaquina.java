package co.com.Sofka.habilitacionDDD.domain.servicioAcondicionamientoFisico.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoMaquina implements ValueObject<String> {

    private final String value;

    public TipoMaquina(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank())
            new IllegalArgumentException("La maquina deve tener un tipo.");

    }

    @Override
    public String value() {
        return value;
    }
}
