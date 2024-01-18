package tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static utils.Constantes.PATH_CREATE;

public class CrearUsuarioPet implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Post.to(PATH_CREATE).with(rq -> rq
                        .header("Content-Type", "application/json")
                        .body("{\n" +
                                "    \"id\": 2525,\n" +
                                "    \"username\": \"Angel\",\n" +
                                "    \"firstName\": \"David\",\n" +
                                "    \"lastName\": \"Marzola\",\n" +
                                "    \"email\": \"Angel@gmail.com\",\n" +
                                "    \"password\": \"angel1234\",\n" +
                                "    \"phone\": \"3127016780\",\n" +
                                "    \"userStatus\": 0\n" +
                                "  }"))
        );


        SerenityRest.lastResponse().prettyPrint();
    }

    public static CrearUsuarioPet conSusDatos(){
        return Tasks.instrumented(CrearUsuarioPet.class);
    }
}
