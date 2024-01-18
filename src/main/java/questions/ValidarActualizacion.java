package questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarActualizacion implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        Integer status=  SerenityRest.lastResponse().statusCode();

        return status;

    }
public static ValidarActualizacion porStatusCode(){
        return new ValidarActualizacion();
}

}
