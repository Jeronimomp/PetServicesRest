package tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;


import static utils.Constantes.PATH_PUT_USER;

public class ActualizarUsuarioPet implements Task {
    private  String userToDelete;

    public ActualizarUsuarioPet(String userToDelete) {
        this.userToDelete = userToDelete;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Put.to(PATH_PUT_USER).with(rq -> rq
                        .header("Content-Type", "application/json")
                        .pathParam("id", userToDelete)
                        .body(" {\n" +
                                "    \"id\": 2525,\n" +
                                "    \"username\": \"Angel\",\n" +
                                "    \"firstName\": \"Pepito\",\n" +
                                "    \"lastName\": \"Marzola\",\n" +
                                "    \"email\": \"AngelPepito@gmail.com\",\n" +
                                "    \"password\": \"angel1234\",\n" +
                                "    \"phone\": \"3127016780\",\n" +
                                "    \"userStatus\": 0\n" +
                                "  }"))
        );


        SerenityRest.lastResponse().prettyPrint();
    }

    public static ActualizarUsuarioPet porUsername( String userToDelete){

        return Tasks.instrumented(ActualizarUsuarioPet.class, userToDelete);
    }
}
