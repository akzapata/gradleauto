package co.edu.eafit.Steps;
import co.edu.eafit.pageObject.*;

public class LexSteps {
	LexPageObject lexPageObject;
	
	
	public void abrepaglex() {
		lexPageObject.open();
		
	}


	public void ingresadlogin(String usrLex, String pwdlex) {
		lexPageObject.ingeesologin(usrLex,pwdlex);
		
	}


	public void vepaginappal() {
		lexPageObject.vemensaje();
		
	}

	public void menuEstudiantes() {
		lexPageObject.menestudiantes();
		lexPageObject.opcclasiestudiantes();
		
	}


	public void busqueda() {
		lexPageObject.busqueda();
		
	}

	public void agregarestudiante(String numcodigo) {
		lexPageObject.nuevoregistro(numcodigo);
		
	}


	public void veinfotabla() {
		lexPageObject.validatabla();
		
	}


	public void selecdatos() {
		lexPageObject.seldatos();
		
	}


	public void menuevalestudiantes() {
		lexPageObject.menestudiantes();
		lexPageObject.selopcevaluaciones();
		
	}


	public void selsemestre(String semestre) {
		lexPageObject.selsemestre(semestre);
		
	}


	public void vedatosnotaestudiantes() {
		lexPageObject.venotas();
		
	}


	public void opcnotasaprobadas() {
		lexPageObject.menestudiantes();
		lexPageObject.ingmenunotasapro();
		
	}


	public void venotasasignadas() throws Exception  {
		lexPageObject.venotasasign();
		  

	}


	public void ingmenproceso() {
		lexPageObject.ingmenuproceso();
		
	}


	public void selareacompetencia() {
		lexPageObject.selareacomp();
		
	}


	public void ingresadatostyc(String tip_doc_do, String num_doc_do) {
		lexPageObject.ingresatipynum(tip_doc_do,num_doc_do);
		
	}


	public void ingresadatostycte(String tip_doc_te, String num_doc_te) {
		lexPageObject.ingresatipynumte(tip_doc_te,num_doc_te);
		
	}


	public void ingresadatostycapo(String tip_doc_apo, String num_doc_apo) {
		lexPageObject.ingresatipynumapo(tip_doc_apo,num_doc_apo);
		
	}


	public void ingresadatosconsul() {
		lexPageObject.ingresadconsultorio();
		
	}


	public void vemensajeingreso() {
		lexPageObject.vemsjingreso();
		
	}


	public void opcrepartirproceso() {
		lexPageObject.repartproceso();
		
	}


	public void selrepartir() {
		lexPageObject.repproceso();
		
	}


	public void vemsjrepartir() {
		lexPageObject.vemsjrepartir();
		
	}


	public void opcexaconsultas() {
		lexPageObject.opcexaconsultas();
		
	}


	public void selsemestre() {
		lexPageObject.selsemestreconsulta();
		
	}


	public void vedatosconsulta() {
		lexPageObject.vedatosconsulta();
		
	}


	public void ingresamenagenda() {
		lexPageObject.ingresomenuagenda();
		
	}


	public void ingresatyndocumento(String tip_doc_usr, String num_doc_usr) {
		lexPageObject.ingresodatosusr(tip_doc_usr,num_doc_usr);
		
	}


	public void veinfousuario(String numdcto) {
		lexPageObject.veinfousuario(numdcto);
		
	}


	public void menconsulta() {
		lexPageObject.menconsultas();
		
	}

	
}
