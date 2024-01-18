package stepdefinitions;

import Exceptions.UserException;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import models.DatosUsuarioModel;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidarCreacion;
import tasks.CrearUsuarioPet;
import io.cucumber.java.DataTableType;
import java.util.Map;

import static Exceptions.UserException.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CrearUsuarioPetStepDefinitions {



    @When("se crea un nuevo registro de una mascota")
    public void seCreaUnNuevoRegistroDeUnaMascota(DatosUsuarioModel datosusuarios) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CrearUsuarioPet.conSusDatos(datosusuarios)
        );
    }
    @Then("se observa que el servicio responde con status code {int}")
    public void seObservaQueElServicioRespondeConStatusCode(Integer statusCode) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarCreacion.empleados(), Matchers.equalTo(statusCode))
                .orComplainWith(UserException.class, MESSAGE));

    }
}
