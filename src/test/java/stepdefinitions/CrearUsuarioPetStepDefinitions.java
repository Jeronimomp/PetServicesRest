package stepdefinitions;

import Exceptions.EmployeeException;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import models.DatosUsuarioModel;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidarCreacion;
import tasks.CrearUsuarioPet;

import java.util.Map;

import static Exceptions.EmployeeException.MESSAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CrearUsuarioPetStepDefinitions {



    @When("se crea un nuevo registro de una mascota")
    public void seCreaUnNuevoRegistroDeUnaMascota() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CrearUsuarioPet.conSusDatos()
        );
    }
    @Then("se observa que el servicio responde con status code {int}")
    public void seObservaQueElServicioRespondeConStatusCode(Integer statusCode) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarCreacion.empleados(), Matchers.equalTo(statusCode))
                .orComplainWith(EmployeeException.class, MESSAGE));

    }
}
