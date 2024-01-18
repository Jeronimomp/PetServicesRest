package stepdefinitions;

import Exceptions.EmployeeException;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.ValidarEliminacion;
import tasks.EliminarUsuarioPet;

import static Exceptions.EmployeeException.MESSAGE;
import static org.hamcrest.Matchers.equalTo;

public class EliminarUsuariosStepDefinitions {


    @When("se busca el usuario a eliminar por username {string}")
    public void seBuscaElUsuarioAEliminarPorUsername(String username) {

        OnStage.theActorInTheSpotlight().attemptsTo(
       EliminarUsuarioPet.porUsername(username)

        );

    }
    @Then("se observa el servicio de eliminacion responde con {int}")
    public void seObservaElServicioDeEliminacionRespondeCon(Integer statusCode) {
   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarEliminacion.porMensaje(), Matchers.equalTo(statusCode))
           .orComplainWith(EmployeeException.class, MESSAGE));
    }
}
