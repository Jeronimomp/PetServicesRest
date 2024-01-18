package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;

import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ValidarEliminacion implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        Integer status=  SerenityRest.lastResponse().statusCode();

        return status;

    }
public static ValidarEliminacion porMensaje(){
        return new ValidarEliminacion();
}

}
