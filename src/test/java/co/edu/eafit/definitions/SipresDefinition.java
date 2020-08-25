package co.edu.eafit.definitions;
import co.edu.eafit.Steps.SipresSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SipresDefinition {
	
	@Steps
	SipresSteps sipresSteps;

	
	
	@Given("^que un administrador quiere ingresa a Sipres$")
	public void queUnAdministradorQuiereIngresaASipres() {
		sipresSteps.ingresoSipres();
	}
	
	
	@When("^el ingresa los datos de usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void elIngresaLosDatosDeUsuarioYClave(String arg1, String arg2) {
		//sipresSteps.ingresodatosin();
	}
	
	@Then("^ve la pagina principal de Sipres$")
	public void veLaPaginaPrincipalDeSipres() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}