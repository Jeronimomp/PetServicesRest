package stepdefinitions;

import Exceptions.EmployeeException;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidarUsuarioPorUsername;
import tasks.ConsultarPet;

import static Exceptions.EmployeeException.MESSAGE;

public class ConsultarPetPorIdStepDefinitions {



    @When("consultar usuario con username {string}")
    public void consultarUsuarioConUsername(String username) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultarPet.porUsername(username));
    }
    @Then("Se observa el codigo de respuesta con codigo {int}")
    public void seObservaElCodigoDeRespuestaConCodigo(Integer statusCode) {


     OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuarioPorUsername.porstatusCode(), Matchers.equalTo(statusCode))
             .orComplainWith(EmployeeException.class, MESSAGE));
    }
}
