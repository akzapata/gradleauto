package co.edu.eafit.definitions;


import co.edu.eafit.Steps.MercurioStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MercurioDefinition {

	@Steps
	MercurioStep mercurioStep;

@Given("^que un administrador quiere ingresar a Mercurio$")
public void queUnAdministradorQuiereIngresarAMercurio() {
	mercurioStep.abrep();
	 
}

@When("^el ingresa usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
public void elIngresaUsuarioYClave(String usuario, String clave) {
		mercurioStep.ingresacred(usuario,clave);

}


@Then("^ve la pagina principal de Mercurio$")
public void veLaPaginaPrincipalDeMercurio() {
	mercurioStep.entra();

}

@Then("^el muestra en pantalla el menu Carnetizacion$")
public void elMuestraEnPantallaElMenuCarnetizacion() {
	mercurioStep.veMenucarnet();

}

@Then("^el muestra en pantalla el menu Administracion$")
public void elMuestraEnPantallaElMenuAdministracion() {
	mercurioStep.veMenuadmin();
}

@Then("^ve la opcion Item Presupuesto$")
public void veLaOpcionItemPresupuesto() {
    // Write code here that turns the phrase above into concrete actions
	mercurioStep.Selopcionesman();
}

@Then("^busca la palabra \"([^\"]*)\"$")
public void buscaLaPalabra(String palabraitem) {
	mercurioStep.busqueda(palabraitem);
}


@Then("^ve la palabra en la tabla de items$")
public void veLaPalabraEnLaTablaDeItems() {
	mercurioStep.vetablaitem();
}




@Then("^selecciona la opcion Solicitud masiva de carnes$")
public void seleccionaLaOpcionSolicitudMasivaDeCarnes() {
	mercurioStep.selsolmasivac();
}

@Then("^selecciona \"([^\"]*)\"$")
public void selecciona(String lotei) {
	
	  //mercurioStep.seldatosSolMasiva(lotei,fechad,fechah);
	mercurioStep.sellote(lotei);
	}
	

@Then("^selecciona fecha desde: (\\d+)-(\\d+)-(\\d+) y hasta")
public void seleccionaFechaDesdeHasta(String diad, String mesd, int anod) {
	mercurioStep.ingresafechad(diad, mesd, anod);
}

@Then("^da clic en el boton Buscar$")
public void daClicEnElBotonBuscar() {
	mercurioStep.buscarreg();
}
@Then("^ve en pantalla los datos en la tabla de carnetizacion$")
public void veEnPantallaLosDatosEnLaTablaDeCarnetizacion() {
	mercurioStep.veregcarn();
}

@Given("^que un administrador quiere consultar los datos de carnetizacion de un estudiante$")
public void queUnAdministradorQuiereConsultarLosDatosDeCarnetizacionDeUnEstudiante() {
	mercurioStep.veMenucarnet();
}
@Then("^el ingresa \"([^\"]*)\" y \"([^\"]*)\"$")
public void elIngresaY(String tipodoc, String numdoc) {
	mercurioStep.ingresatipynum(tipodoc,numdoc);
}
@Then("^el realiza la busqueda$")
public void elRealizaLaBusqueda() {
	mercurioStep.busqueda();
}

@Then("^ve en pantalla la informacion del estudiante$")
public void veEnPantallaLaInformacionDelEstudiante() {
	mercurioStep.veinfoestu();
}
@Given("^que un administrador quiere cambiar el numero de documento de un estudiante$")
public void queUnAdministradorQuiereCambiarElNumeroDeDocumentoDeUnEstudiante() {
	mercurioStep.cambiodcto();
}

@When("^el ingresa a la opcion Cambiar documento$")
public void elIngresaALaOpcionCambiarDocumento() {
	mercurioStep.opccambiodcto();
}


@Then("^el ingresa tipo_doc_antes \"([^\"]*)\" Num_doc_antes \"([^\"]*)\" tipo_doc_despues \"([^\"]*)\" y Num_doc_despues \"([^\"]*)\"$")
public void elIngresaTipo_doc_antesNum_doc_antesTipo_doc_despuesYNum_doc_despues(String tip_ant, String num_ant, String tip_des, String num_des) {
	mercurioStep.ingresadatoscambio( tip_ant, num_ant, tip_des,  num_des);
}

@Then("^da clic en el boton buscar y en el boton actualizar$")
public void daClicEnElBotonBuscarYEnElBotonActualizar() {
	mercurioStep.realizacambio();
		
}

@Then("^el ve en pantalla el mensaje de cambio de documento exitoso$")
public void elVeEnPantallaElMensajeDeCambioDeDocumentoExitoso() {
	mercurioStep.vemensajecambio();
}

@Given("^que un administrador quiere buscar la informacion de un cliente$")
public void queUnAdministradorQuieroBuscarLaInformaciNDeUnCliente() {
	mercurioStep.veMenucliente();
}

@When("^el ingresa a la opcion datos basicos clientes$")
public void elingresaalaopciondatosbasicosclientes() {
	mercurioStep.ingopcbatosba();
}

@Then("^el ingresa \"([^\"]*)\" y \"([^\"]*)\" del cliente$")
public void elIngresaYDelCliente(String tipCl, String numCl) {
	mercurioStep.ingresaDclientes(tipCl,numCl);
}

@Then("^ve en pantalla la informacion del cliente$")
public void veEnPantallaLaInformacionDelCliente() {
	mercurioStep.validamsjclien();
    }

@Given("^que un administrador quiere hacer el registro de un cliente$")
public void queUnAdministradorQuiereHacerElRegistroDeUnCliente() {
	mercurioStep.veMenucliente();
}


@When("^el ingresa a la opcion Registro clientes$")
public void elIngresaALaOpcionRegistroClientes() {
	mercurioStep.opRegCliente();
}

@Then("^el ingresa los datos \"([^\"]*)\" y \"([^\"]*)\"$")
public void elIngresaLosDatosY(String Tpd, String Nrd) {
    // Write code here that turns the phrase above into concrete actions
	mercurioStep.ingresaDclientes(Tpd,Nrd);
}

@Then("^ve en pantalla los datos del cliente$")
public void veEnPantallaLosDatosDelCliente() {
	mercurioStep.vedatoscliente();
	
	
	
}



@Given("^que un administrador quiere verificar la longitud del campo numero de documento$")
public void queUnAdministradorQuiereVerificarLaLongitudDelCampoNumeroDeDocumento() {
	mercurioStep.veMenucliente();
}


@When("^el selecciona tipo documento: \"([^\"]*)\" y numero de documento: \"([^\"]*)\"$")
public void elSeleccionaTipoDocumentoYNumeroDeDocumento(String Tipdoc, String Numdoc) {
	mercurioStep.ingresaDclientes(Tipdoc,Numdoc);
}



@When("^el ingresa los datos del cliente Nombre: \"([^\"]*)\" Apellido: \"([^\"]*)\" Genero: \"([^\"]*)\"$")
public void elIngresaLosDatosDelClienteNombreApellidoGenero(String Nom, String Ape, String Gen) {
	mercurioStep.ingresodatosform(Nom, Ape, Gen);
}

@Then("^ve mensaje de registro exitoso \"([^\"]*)\"$")
public void veMensajeDeRegistroExitoso(String Mensajeregesxito) {

	mercurioStep.validamsjregistro(Mensajeregesxito);

}


}

