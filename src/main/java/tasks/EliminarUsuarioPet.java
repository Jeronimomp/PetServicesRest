package tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static utils.Constantes.PATH_DELETE_USER;

public class EliminarUsuarioPet implements Task {
    private String username;

    public EliminarUsuarioPet(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(PATH_DELETE_USER).with(rq ->rq
                        .header("Content-Type","application/json")
                        .pathParam("id",username)
                )
        );
        SerenityRest.lastResponse().prettyPrint();

    }
    public static EliminarUsuarioPet porUsername(String username){
        return Tasks.instrumented(EliminarUsuarioPet.class, username);
    }
}
