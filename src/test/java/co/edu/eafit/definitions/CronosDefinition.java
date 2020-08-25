
package co.edu.eafit.definitions;
import java.text.ParseException;

import co.edu.eafit.Steps.CronosSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class CronosDefinition {

	
	@Steps
	CronosSteps cronosSteps	;

	@Given("^que un administrador quiere ingresar a Cronos$")
	public void queUnAdministradorQuiereIngresaACronos() {
	cronosSteps.ingresocronos();
	}

	@When("^el ingresa los datos usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void elIngresaLosDatosUsuarioYClave(String user, String password) {
		cronosSteps.ingresoapp(user,password);    
	}

	@Then("^ve la pagina principal de Cronos$")
	public void veLaPaginaPrincipalDeCronos() {
		cronosSteps.vepaginacronos();
	}
	
	
	@Given("^que un administrador ingresa a la opcion proveedores$")
	public void queUnAdministradorIngresaALaOpcionProveedores() {
		cronosSteps.menproveedores();
	}
	
	@When("^el edita un proveedor$")
	public void elEditaUnProveedor() throws InterruptedException {
		cronosSteps.editaproveedor();
	}
	
	@Then("^el ve en pantalla la informacion actualizada$")
	public void elVeEnPantallaLaInformacionActualizada() throws InterruptedException {
	   cronosSteps.vemenactualiza();
	}
	
	@Given("^que un administrador ingresa a la opcion Solicitar requerimiento$")
	public void queUnAdministradorIngresaALaOpcionSolicitarRequerimiento() {
		cronosSteps.mensolrequerimiento();
	}
	
	
	@When("^el ingresa a la opcion Crear requerimiento de servicio$")
	public void elIngresaALaOpciNCrearaRequerimientoDeServicio() {
		cronosSteps.opccrearreq();
	}
	
	@When("^el ingresa los datos del requerimiento$")
	public void elIngresaLosDatosDelRequerimiento() throws InterruptedException {
		cronosSteps.ingresodatosrequeriemiento();
	}
	
	@Then("^el ve en pantalla la confirmacion de creacion de requerimiento$")
	public void elVeEnPantallaLaConfirmacionDeCreacionDeRequerimiento() {
		cronosSteps.vemensajecreacion();
	}
	
	
		
	
	@Given("^que un administrador ingresa al menu bienes$")
	public void queUnAdministradorIngresaAlMenuBienes() {
		cronosSteps.menBienes();
	}
	
	
	@When("^el ingresa a la opcion Lista de requerimientos$")
	public void elNgresaALaOpcionListaDeRequerimientos() {
		cronosSteps.opclstareq();
	}
	
	@When("^el ingresa a la opcion fecha de requerimiento desde (.*) hasta (.*)$")
	public void elIngresaALaOpcionFechaDeRequirimientoDesdeHasta(String fechad, String fechah) throws ParseException {
		cronosSteps.ingresafechas(fechad,fechah);
		
	}
	
	@Then("^el ve en pantalla los requerimientos$")
	public void elVeEnPantallaLosRequeriemientos() throws InterruptedException {
		cronosSteps.verequerbienes();
	}
	
	
	@Given("^que un administrador ingresa a la opcion Solicitar requerimiento de Bienes$")
	public void queUnAdministradorIngresaALaOpcionSolicitarRequerimientoDeBienes() {
		cronosSteps.menBienes();
	   
	}
	
	
	@When("^el ingresa a la opcion Crear requerimiento de Bienes$")
	public void elIngresaALaOpcionCrearRequerimientoDeBienes() {
		
		cronosSteps.opcreqbienes();
	}
	
	@When("^el ingresa los datos del requerimiento de bienes$")
	public void elIngresaLosDatosDelRequerimientoDeBienes() throws InterruptedException {
		cronosSteps.ingresadatosreqbienes();
	}
	
	@Then("^el ve en pantalla la confirmacion de creacion de requerimiento de Bienes$")
	public void elVeEnPantallaLaConfirmacionDeCreacionDeRequerimientoDeBienes() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cronosSteps.vemensajebienes();
	}
	
	@Given("^que un administrador ingresa a la opcion Requerimientos$")
	public void queUnAdministradorIngresaALaOpcionRequerimientos() {
		cronosSteps.menBienes();
		

	}
	
	
	@When("^el ingresa a la opcion Confirmar bienes recurrentes$")
	public void elIngresaALaOpcionConfirmarBienesRecurrentes() {
		cronosSteps.opcbienesrecurrentes();
	}
	
	@When("^el ingresa los datos del bienes recurrente$")
	public void elIngresaLosDatosDelBienesRecurrente() throws InterruptedException {
		cronosSteps.ingresadatosbienrecur();
	}
	
	@Then("^el ve en pantalla las ordenes creadas$")
	public void elVeEnPantallaLasOrdenesCreadas() {
		cronosSteps.vetablaordenes();
	}



		
}
		
		
