package co.edu.eafit.pageObject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl ("http://tapproyecto.eafit.edu.co/lex/")

public class LexPageObject extends PageObject {

	
	@FindBy(name="login" )
	public WebElementFacade txtusr;
	
	@FindBy(name="clave" )
	public WebElementFacade txtpsw;
	
	@FindBy(xpath="//input[@alt='Entrar']")
	public WebElementFacade btnentrar;
	
	@FindBy(xpath="//p[@align=\"center\"]//*[contains(text(),'Bienvenido')]")
	public WebElementFacade msjbienvenida;
	
	@FindBy(xpath="//img[@alt='Estudiantes']")
	public WebElementFacade menEstudiantes;
	
	@FindBy(xpath="//a[text()='Clasificación Estudiantes']")
	public WebElementFacade opcclasestudiantes;

	@FindBy(xpath="//select[@name='semestre' or @name='proceso.semestre']")
	public WebElementFacade lstsemestre;
	
	@FindBy(xpath="//select[@name='tipoAsesoria' or @name= 'detalleEstudianteVO.idTipoAsesoria']")
	public WebElementFacade lsttipasesoria;
	
	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_consultar.gif']")
	public WebElementFacade btnConsultaras;
	
	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_agregar.gif']")
	public WebElementFacade btnagregar;
	
	@FindBy(xpath="//table[@class='texto']/tbody/tr[2]/td[1]")
	public WebElementFacade restabla;
	
	@FindBy(xpath="//input[@name='detalleEstudianteVO.codigo']")
	public WebElementFacade txtnumdcto;
	
	@FindBy(xpath="//select[@name='detalleEstudianteVO.codigoMateria']")
	public WebElementFacade selmateria;
	
	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_guardar.gif']")
	public WebElementFacade btnguardarreg;
	
	@FindBy(xpath="//a[@href='cargarPaginaEvaluacionEstudiantes.do']")
	public WebElementFacade menevalestudiantes;
	
	@FindBy(xpath="//table[@width='70%']/tbody/tr[2]/td[1]")
	public WebElementFacade tblnota;

	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_consultar.gif']")
	public WebElementFacade btnconsultarnotas;
	
	@FindBy(xpath="//a[@href='cargarPaginaEvaluacionEstudiantesAdminAprobados.do']")
	public WebElementFacade mennotasaprob;
	
	@FindBy(xpath="//table[@width='85%']/tbody/tr[2]/td[2]")
	public WebElementFacade tblnotaasign;
	
	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/menu_sup/btn_procesos.gif']")
	public WebElementFacade menproceso;
	
	@FindBy(xpath="//a[@href=\"cargarPaginaIngresoProcesos.do\"]")
	public WebElementFacade opcingreproceso;
	
	@FindBy(xpath="//select[@name='proceso.codArea']")
	public WebElementFacade lstareacompetencia;
	
	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_seleccionar.gif']")
	public WebElementFacade btnseleccionar;
	
	@FindBy(xpath="//select[@name='proceso.usurioResiste.tipoDcto' ]")
	public WebElementFacade lsttipdocdo;
	
	@FindBy(xpath="//select[@name='proceso.usurioEjerce.tipoDcto']")
	public WebElementFacade lsttipdocre;
	
	@FindBy(xpath="//select[@name='proceso.apoderado.tipoDcto' ]")
	public WebElementFacade lsttipdocapo;
	
	@FindBy(xpath="//input[@name='proceso.usurioResiste.nroDcto' ]")
	public WebElementFacade txtnumdoc;
	
	@FindBy(xpath="//input[@name='proceso.usurioEjerce.nroDcto' ]")
	public WebElementFacade txtnumdocte;
	
	@FindBy(xpath="//input[@name='proceso.apoderado.nroDcto' ]")
	public WebElementFacade txttipdocapo;
	
	@FindBy(xpath="//select[@name='proceso.codigoEstudianteSemestre' ]")
	public WebElementFacade lstestudiante;
	
	@FindBy(xpath="//input[@type= 'radio'  and @name ='proceso.codigoRepresenta' ]")
	public WebElementFacade radapoderado;
		
	@FindBy(xpath="//a[@href='javascript:buscarApoderado()']")
	public WebElementFacade btnapoderado;
	
	@FindBy(xpath="//a[@href='javascript:buscarEjerce()']")
	public WebElementFacade btnejerce;
	
	@FindBy(xpath="//a[@href='javascript:buscarDefiende()']")
	public WebElementFacade btndefiende;
	
	@FindBy(xpath="//a[@href='javascript:ingresarProceso();']")
	public WebElementFacade btningreso;
	
	@FindBy(xpath="//*[@id=\"tblMensaje\"]/tbody/tr/td[2]")
	public WebElementFacade msjingresado;
	
	@FindBy(xpath="//a[@href='cargarPaginaReasignacionProcesos.do']")
	public WebElementFacade opcrepartirproceso;
	
	@FindBy(xpath="//a[@href='javascript:consultarProcesos()']")
	public WebElementFacade btnrepartirproceso;
	
	@FindBy(xpath="//table[3]/tbody/tr/td[2]/form/table[1]/tbody/tr[2]/td")
	public WebElementFacade msjrepartir;
	
	@FindBy(xpath="//select[@name='proceso.codAsunto']")
	public WebElementFacade lstasunto;
	
	@FindBy(xpath="//a[@href='/lex/consultas/index.do']")
	public WebElementFacade menconsultas;
	
	@FindBy(xpath="//a[@href='cargarPaginaExaminarConsulta.do?accionAEjecutar=consultarConsultasAsesoresXSemestre']")
	public WebElementFacade opcexaconsulestudiantes;

	@FindBy(xpath="//table[3]/tbody/tr/td[2]/form/table[2]/tbody/tr[1]/td[1]")
	public WebElementFacade mentablaconsulta;
	
	@FindBy(xpath="//a[@href='/lex/agenda/index.do']")
	public WebElementFacade menuagengda;
	
	@FindBy(xpath="//a[@href='cargarPaginaBusqueda.do?accionObjetivo=cargarPaginaAgendaPersonalxUsuario']")
	public WebElementFacade opcagengdausuario;
	
	@FindBy(xpath="//select[@name='tipoDocumento']")
	public WebElementFacade lsttipdoc;
	
	@FindBy(xpath="//input[@name='numeroDocumento']")
	public WebElementFacade txtnumdocto;
	
	@FindBy(xpath="//input[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_buscar.gif']")
	public WebElementFacade btnbuscar;
	
	@FindBy(xpath="//table[3]/tbody/tr/td[2]/form/table[2]/tbody/tr[2]/td[3]")
	public WebElementFacade tblnumdcto;
	
	@FindBy(xpath="//a[@href='datoscliente.do']")
	public WebElementFacade opcingresarconsulta;
	
	public void ingeesologin(String usrLex, String pwdlex) {
		getDriver().switchTo().frame(0); 
		txtusr.sendKeys(usrLex);
		txtpsw.sendKeys(pwdlex);
		btnentrar.click();
	}


	public void vemensaje() {
		assertThat(msjbienvenida.getTextValue(), containsString("Bienvenido"));
		
	}

	public void menestudiantes() {
		menEstudiantes.click();
		
	}
	
	public void opcclasiestudiantes() {
		opcclasestudiantes.click();
		
	}


	public void busqueda() {
		lstsemestre.selectByValue("20201");
		lsttipasesoria.selectByValue("EXT");
		
	}

	

	public void validatabla() {
		btnConsultaras.click();
		Assert.assertNotNull(restabla.getTextValue());
		
		
	}


	public void nuevoregistro(String numcodigo) {
		btnagregar.click();
		txtnumdcto.sendKeys(numcodigo);
		
		
	}


	public void seldatos() {
		selmateria.selectByValue("DE0151");
		lsttipasesoria.selectByValue("EXT");
		btnguardarreg.click();
		
	}


	public void selopcevaluaciones() {
		menevalestudiantes.click();
		
	}


	public void selsemestre(String semestre) {
		lstsemestre.selectByValue(semestre);
		btnconsultarnotas.click();
		
	}


	public void venotas() {
		
		Assert.assertNotNull(tblnota.getTextValue());
		
	}


	public void ingmenunotasapro() {
		mennotasaprob.click();

		
		
	}


	public void venotasasign() throws Exception  {
		Assert.assertNotNull(tblnotaasign.getTextValue());

	
	}


	public void ingmenuproceso() {
		menproceso.click();
		opcingreproceso.click();
		
	}


	public void selareacomp() {
		lstareacompetencia.selectByValue("4");
		btnseleccionar.click();
	}


	public void ingresatipynum(String tip_doc_do, String num_doc_do) {
		lsttipdocdo.click();
		lsttipdocdo.selectByValue(tip_doc_do);
		txtnumdoc.sendKeys(num_doc_do);
		btndefiende.click();
	}


	public void ingresatipynumte(String tip_doc_te, String num_doc_te) {
		lsttipdocre.click();
		lsttipdocre.selectByValue(tip_doc_te);
		txtnumdocte.sendKeys(num_doc_te);
		btnejerce.click();
		
	}


	public void ingresatipynumapo(String tip_doc_apo, String num_doc_apo) {
		lsttipdocapo.click();
		lsttipdocapo.selectByValue(tip_doc_apo);
		txttipdocapo.sendKeys(num_doc_apo);
		btnapoderado.click();
	}


	public void ingresadconsultorio() {
		lstsemestre.click();
		lstsemestre.selectByValue("20201");
		lstestudiante.click();
		lstestudiante.selectByValue("10405");
		lstasunto.selectByValue("15");
		radapoderado.click();
		
		
	}


	public void vemsjingreso() {
		btningreso.click();
		assertThat(msjingresado.getTextValue(), containsString("El proceso ha sido")); 
		
	}


	public void repartproceso() {
		menproceso.click();
		opcrepartirproceso.click();
		
	}


	public void repproceso() {
		btnrepartirproceso.click();
		getDriver().switchTo().alert().accept();
		
	}


	public void vemsjrepartir() {
		Assert.assertNotNull(msjrepartir.getTextValue());
		
	}


	public void opcexaconsultas() {
		menconsultas.click();
		opcexaconsulestudiantes.click();
	}


	public void selsemestreconsulta() {
		lstsemestre.click();
		lstsemestre.selectByValue("20201");
	}


	public void vedatosconsulta() {
		
		Assert.assertNotNull(mentablaconsulta.getTextValue()); 
		
	}


	public void ingresomenuagenda() {
		menuagengda.click();
		opcagengdausuario.click();
	}


	public void ingresodatosusr(String tip_doc_usr, String num_doc_usr) {
		lsttipdoc.click();
		lsttipdoc.selectByValue(tip_doc_usr);
		txtnumdocto.sendKeys(num_doc_usr);
		
	}


	public void veinfousuario(String numdcto) {
		btnbuscar.click();
		Assert.assertEquals(numdcto.trim(), tblnumdcto.getTextValue().trim());
		
		
	}


	public void menconsultas() {
		menconsultas.click();
		opcingresarconsulta.click();
	}
	


	
}
