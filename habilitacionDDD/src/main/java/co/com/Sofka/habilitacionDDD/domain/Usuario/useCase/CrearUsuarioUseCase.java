package co.com.Sofka.habilitacionDDD.domain.Usuario.useCase;

import co.com.Sofka.habilitacionDDD.domain.Usuario.agregate.Usuario;
import co.com.Sofka.habilitacionDDD.domain.Usuario.comands.CrearUsuario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearUsuarioUseCase extends UseCase<RequestCommand<CrearUsuario>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearUsuario> input) {
        var command = input.getCommand();
        var usuario = new Usuario(command.getIdUsuario(),command.getDocumentoIdentidad(),
                command.getTipoDocumento(),command.getHuellaDactilar(),command.getNombre());

        emit().onResponse(new ResponseEvents(usuario.getUncommittedChanges()));
    }
}
