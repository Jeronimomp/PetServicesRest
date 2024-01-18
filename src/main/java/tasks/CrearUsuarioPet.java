package tasks;

import models.DatosUsuarioModel;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static utils.Constantes.PATH_CREATE;

public class CrearUsuarioPet implements Task {
    private DatosUsuarioModel datosUsuario;

    public CrearUsuarioPet(DatosUsuarioModel datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Post.to(PATH_CREATE).with(rq -> rq
                        .header("Content-Type", "application/json")
                        .body(datosUsuario))
        );


        SerenityRest.lastResponse().prettyPrint();
    }

    public static CrearUsuarioPet conSusDatos(DatosUsuarioModel datosUsuario){
        return Tasks.instrumented(CrearUsuarioPet.class, datosUsuario);
    }
}
