package co.edu.eafit.definitions;

import co.edu.eafit.Steps.LexSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LexDefinition {

	@Steps
	LexSteps lexSteps;


@Given("^que un administrador quiere ingresar a Lex$")
public void queUnAdministradorQuiereIngresarALex() {
	lexSteps.abrepaglex();
}

@When("^el ingresa datos usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
public void elIngresaDatosUsuarioYClave(String usrLex, String pwdlex) {
	lexSteps.ingresadlogin(usrLex,pwdlex);
}


@Then("^ve la pagina principal de Lex$")
public void veLaPaginaPrincipalDeLex() {
	lexSteps.vepaginappal();
}

@Given("^que un administrador ingresa a la opcion estudiantes$")
public void queUnAdministradorIngresaALaOpcionEstudiantes() {
	lexSteps.menuEstudiantes();
	
}

@When("^el realiza la busqueda por semestre y tipo de asesoria$")
public void elRealizaLaBusquedaPorPorSemestreYTipoDeAsesoria() {
	lexSteps.busqueda();
}

@Then("^el ve en pantalla la informacion del estudiante$")
public void elIngresaVeEnPantallaLaInformacionDelEstudiante() {
	lexSteps.veinfotabla();
}

@When("^el ingresa el codigo del estudiante \"([^\"]*)\"$")
public void elIngresaElCodigoDelEstudiante(String numcodigo) {
    // Write code here that turns the phrase above into concrete actions
	lexSteps.agregarestudiante(numcodigo);
}
@When("^el selecciona los datos para crer el registro$")
public void elSeleccionaLosDatosParaCrerElRegistro() {
	lexSteps.selecdatos();
}

@Given("^que un administrador quiere consultar la evaluacion de estudiantes$")
public void queUnAdministradorQuiereConsultarLaEvaluacionDeEstudiantes() {
	
	lexSteps.menuevalestudiantes();
}


@When("^el realiza la busqueda por semestre \"([^\"]*)\"$")
public void elRealizaLaBusquedaPorSemestre(String semestre) {
	lexSteps.selsemestre(semestre);
}

@Then("^el ve en pantalla los datos del estudiante$")
public void elVeEnPantallaLosDatosDelEstudiante() {
	lexSteps.vedatosnotaestudiantes();
}


@Given("^que un administrador ingresa a la opcion notas aprobadas$")
public void queUnAdministradorIngresaALaOpciNNotasAprobadas() {
	lexSteps.opcnotasaprobadas();
}


@When("^el selecciona el semestre \"([^\"]*)\"$")
public void elSeleccionaElSemestre(String semestre) {
	lexSteps.selsemestre(semestre);
}

@Then("^el ve en pantalla las notas asignadas a un estudiante$")
public void elVeEnPantallaLasNotasAsignadasAUnEstudiante() throws Exception  {
	lexSteps.venotasasignadas();
}

@Given("^que un administrador ingresa a la opcion ingreso proceso$")
public void queUnAdministradorIngresaALaOpcionIngresoProceso() {
	lexSteps.ingmenproceso();
}


@When("^el selecciona el area de competencia$")
public void elSeleccionaElAreaDeCompetencia() {
	lexSteps.selareacompetencia();
}


@When("^ingresa los datos del Demandado \"([^\"]*)\" y \"([^\"]*)\"$")
public void ingresaLosDatosDelDemandadoY(String tip_doc_do, String num_doc_do) {
	lexSteps.ingresadatostyc(tip_doc_do,num_doc_do);
}


@When("^ingresa los datos del Demandante \"([^\"]*)\" y \"([^\"]*)\"$")
public void ingresaLosDatosDelDemandanteY(String tip_doc_te, String num_doc_te) {
	lexSteps.ingresadatostycte(tip_doc_te,num_doc_te);
}

@When("^ingresa los datos del Apoderado Contraparte \"([^\"]*)\" y \"([^\"]*)\"$")
public void ingresaLosDatosDelApoderadoContraparteY(String tip_doc_apo, String num_doc_apo) {
	lexSteps.ingresadatostycapo(tip_doc_apo,num_doc_apo);
}

@When("^ingresa los datos del Consultorio Juridico$")
public void ingresaLosDatosDelConsultorioJurDico() {
	lexSteps.ingresadatosconsul();
}

@Then("^el ve en pantalla el mensaje de exito del proceso ingresado$")
public void elVeEnPantallaElMensajeDeExitoDelProcesoIngresado() {
	lexSteps.vemensajeingreso();
}

@Given("^que un administrador ingresa a la opcion repartir proceso$")
public void queUnAdministradorIngresaALaOpcionRepartirProceso() {
	lexSteps.opcrepartirproceso();
}


@When("^el selecciona el boton repartir$")
public void elSeleccionaElBotonRepartir() {
	lexSteps.selrepartir();
}

@Then("^el ve en pantalla la reasignacion de los procesos$")
public void elVeEnPantallaLaReasignacionDeLosProcesos() {
	lexSteps.vemsjrepartir();
}


@Given("^que un administrador ingresa a la opcion examinar consultas asignadas$")
public void queUnAdministradorIngresaALaOpcionExaminarConsultasAsignadas() {
	lexSteps.opcexaconsultas();
}


@When("^el selecciona el semestre$")
public void elSeleccionaElSemestre() {
	lexSteps.selsemestre();
}

@Then("^el ve en pantalla las consultas asignadas por estudiante$")
public void elVeEnPantallaLasConsultasAsignadasPorEstudiante() {
	lexSteps.vedatosconsulta();
}

@Given("^que un administrador ingresa a la opcion Agenda por usuario$")
public void queUnAdministradorIngresaALaOpcionAgendaPorUsuario() {
	lexSteps.ingresamenagenda();
}

@When("^el selecciona tipo documento: \"([^\"]*)\" e ingresa el numero de documento: \"([^\"]*)\"$")
public void elSeleccionaTipoDocumentoEIngresaElNumeroDeDocumento(String tip_doc_usr, String num_doc_usr) {
	lexSteps.ingresatyndocumento(tip_doc_usr,num_doc_usr);
}


@Then("^ve la informacion del usuario  \"([^\"]*)\"$")
public void veLaInformacionDelUsuario(String numdcto) {
	lexSteps.veinfousuario(numdcto);
}
@Given("^que un administrador ingresa a la opcion ingresar consulta$")
public void queUnAdministradorIngresaALaOpcionIngresarConsulta() {
	lexSteps.menconsulta();
}
}
