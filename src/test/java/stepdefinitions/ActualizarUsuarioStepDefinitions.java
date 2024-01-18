package stepdefinitions;
import Exceptions.EmployeeException;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidarActualizacion;
import tasks.ActualizarUsuarioPet;
import tasks.ConsultarPet;

import static Exceptions.EmployeeException.MESSAGE;

public class ActualizarUsuarioStepDefinitions {

    @When("se manda el username del usuario a actualizar {string}")
    public void seMandaElUsernameDelUsuarioAActualizar(String usuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ActualizarUsuarioPet.porUsername(usuario),
                ConsultarPet.porUsername(usuario)
        );
    }
    @Then("se valida que el usuario es actualizado con codigo {int}")
    public void seValidaQueElUsuarioEsActualizadoConCodigo(Integer statusCode) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarActualizacion.porStatusCode(), Matchers.equalTo(statusCode))
                .orComplainWith(EmployeeException.class, MESSAGE));
    }
}
