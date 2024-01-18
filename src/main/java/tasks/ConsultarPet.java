package tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;


import static utils.Constantes.PATH_GET_PET_ID;

public class ConsultarPet implements Task {

    private String username;

    public ConsultarPet(String username) {
        this.username = username;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(PATH_GET_PET_ID).with(req->req
                        .header("Content-Type","application/json")
                        .pathParam("id", username)

                )
        );
        SerenityRest.lastResponse().prettyPrint();

    }

    public static ConsultarPet porUsername(String username){
        return Tasks.instrumented(ConsultarPet.class,username);
    }
}
