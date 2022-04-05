package co.com.Sofka.habilitacionDDD.domain.Usuario.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDocumento implements ValueObject<String> {

    private final String value;

    public TipoDocumento(String value) {
        this.value = Objects.requireNonNull(value);

        if(this.value.isBlank()) //Que no sea vacio
            new IllegalArgumentException("Debes Asignarle un Tipo al Documento ");
    }

    @Override
    public String value() {
        return value;
    }
}
