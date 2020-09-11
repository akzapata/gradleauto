package co.edu.eafit.pageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@DefaultUrl ("http://tapproyecto.eafit.edu.co/mercurio/")

public class MercurioPageO  extends PageObject {

	@FindBy(name="login" )
	public WebElementFacade txtusr;
	
	@FindBy(id="inputPassword" )
	public WebElementFacade txtclav;
	
	@FindBy(xpath="/html/body/form/div[2]/input[4]")
	public WebElementFacade btingreso;
	
	@FindBy( xpath = "//*[@id=\"cabezote\"]/div/div/ul/li/a" )
	public WebElementFacade txtppal;

	@FindBy( xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a" )
	public WebElementFacade TitCarne;
	
	@FindBy( xpath  = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a" )
	public WebElementFacade TitAdmin;
	
	@FindBy( xpath  = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a" )
	public WebElementFacade TitCliente;
	
	@FindBy( xpath= "//a[@href='/mercurio/faces/carnetizacion/solicitudMasiva.xhtml']")
	public WebElementFacade opSolMasiva;
	
	@FindBy(id="formBuscar:loteImpSel")
	public WebElementFacade lstIdio;
	
	@FindBy(id="formBuscar:j_idt79_input")
	public WebElementFacade campocal;
	
	@FindBy(xpath="//span[contains(@class,'ui-icon ui-icon-circle-triangle-w')]")
	public WebElementFacade  flechaizq;
	
	@FindBy(xpath="//div[@class='ui-datatable-tablewrapper']//tbody[@id='j_idt94:solMasCarne_data']/tr[1]/td[3]")
	public WebElementFacade tablares;
	
	@FindBy(xpath="//*[@id=\"menu-lateral\"]/div[2]/a[4]")
	public WebElementFacade menMantenimiento;
	
	@FindBy(xpath="//*[@id=\"menu-lateral\"]/div[2]/a[4]")
	public WebElementFacade opcitempres;
	
	@FindBy(xpath="//*[@id=\"contWrapper\"]/form/table[1]/tbody/tr[1]/td[2]/input")
	public WebElementFacade textitem;
	
	@FindBy(xpath= "//tr[@class='trOdd']/td[4]")
	public WebElementFacade tablapal;
	
	@FindBy(name= "tipoDocumentoViejo")
	public WebElementFacade tipantes;
	
	@FindBy(xpath= "//*[@id=\"contWrapper\"]/form/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]/input")
	public WebElementFacade numantes;
	
	@FindBy(xpath= "//*[@id=\"contWrapper\"]/form/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[2]/select")
	public WebElementFacade tipdes;
	
	@FindBy(xpath= "//*[@id=\"contWrapper\"]/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[2]/input")
	public WebElementFacade numdes;
	
	
	@FindBy(xpath= "//a[@href='/mercurio/clientes/datoscliente.do']")
	public WebElementFacade mendatclient;
	
	@FindBy(xpath= "//select[@name='tipoDocumento'  or  @name='tipoDocumentoBusqueda']")
	public WebElementFacade lsttipcl;
	
	@FindBy(xpath= "//input[@name='numeroDocumentoBusqueda' or @name= 'numeroDocumento'  ]")
	public WebElementFacade txtnumcl;
	
	@FindBy(xpath="//*[@id=\"contWrapper\"]/form/table/tbody/tr[3]/td/input")
	public WebElementFacade btnbusclieR;
	
	@FindBy(xpath="//a[@href='javascript:buscar();']")
	public WebElementFacade btnbusclie;
	
	@FindBy(xpath="//input[@name='nombre']")
	public WebElementFacade nombre;

	@FindBy(xpath="//a[@class='list-group-item' and text()='Registro Clientes']")
	public WebElementFacade opRegcliente;
	
	@FindBy(xpath="//*[@id=\"detalleBasicos\"]/table/tbody/tr[4]/td[2]/input")
	public WebElementFacade datocliente; 
	
	
	@FindBy(xpath="//*[@id=\"detalleBasicos\"]/table/tbody/tr[1]/td[2]/input")
	public WebElementFacade nombremostrado;
	
	@FindBy(xpath="//input[@name='apellido']")
	public WebElementFacade txtapellido;
	
	@FindBy(xpath="//select[@name='codigoSexo']")
	public WebElementFacade lstgenero;
	
	@FindBy(xpath="//select[@name='codigoPaisResidencia']")
	public WebElementFacade lstcodpais;
	
	@FindBy(xpath="//select[@name='codigoDepartamentoResidencia']")
	public WebElementFacade lstcoddpto;
	
	@FindBy(xpath="//select[@name='codigoCiudadResidencia']")
	public WebElementFacade lstcodciu;
	
	@FindBy(xpath="//img[@src='http://tapproyecto.eafit.edu.co/imagenes/v1/botones/btn_guardar.gif']")
	public WebElementFacade btnguardarfrm;
	
	@FindBy(xpath="//td[@class='msgMensaje']")
	public WebElementFacade msjregexitoso;
	
	public void ingresausr(String usuariom) {
		getDriver().switchTo().frame(0); 
		
		txtusr.sendKeys(usuariom);
		
		
	}

	public void ingresapw(String clavem) {
		txtclav.sendKeys(clavem);
	
	}

	
	public void clbtn() {
			btingreso.click();
			
		
	}

	public void vepag() {
		
		txtppal.click();
		txtppal.isCurrentlyVisible();
		
	
		
	}



	public void vemencarnet() {
		TitCarne.click();
		//TitCarne.click();
		
	}

	public void vemenadmin() {
		TitAdmin.click();
		
	}

	public void vemencliente() {
		TitCliente.click();
		
	}

	public void selsolimasiva() {
		opSolMasiva.click();
		
	}

	public void sellote(String lotei) {
		lstIdio.click();
		lstIdio.selectByValue(lotei);
		
		//lstIdio.selectByVisibleText(lotei);
		
	}


	public void ingrfechadesde(String diad, String mesd, int anod) {
		campocal.click();
		String fecha_desde;
		fecha_desde = anod + "-" + mesd+ "-" + diad;
		
		int Diai = Integer.parseInt(diad);
		String Dias = Integer.toString(Diai);
		long monthsBetween = ChronoUnit.MONTHS.between(LocalDate.parse(fecha_desde).withDayOfMonth(1),
				LocalDate.now().withDayOfMonth(1));//fecha actual
		
		int monthnumber = (int) (monthsBetween);
		for (int j = 0; j < monthnumber; j++) 
		{
			flechaizq.click();
		}
		
		int filas = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr")).size();
		//int columnas = Serenity.getWebdriverManager().getCurrentDriver().findElements(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr/td")).size() ;

			for (int h = 1; h <= filas; h++) 
					{
					for (int k = 1; k <= filas; k++) 
						{
						String diaformat = Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr[" + h + "]/td[" + k + "]")).getText();
						if (diaformat.contentEquals(Dias)) 
					{
					//Si son iguales los selecciona
				Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr[" + h + "]/td[" + k + "]")).click();
				break;
					}
			}
			}
				
	}

	public void buscareg() {
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//span[@class='ui-button-text ui-c' and text()=\"Buscar\"] ")).click();
		
		
		
	}

	public void Vetablacar() {


		String Lote=tablares.getText();
		tablares.click();
		String lotem= Serenity.getWebdriverManager().getCurrentDriver().findElement(By.id( "formBuscar:loteImpSel")).getText();
		assertThat  (lotem,containsString(Lote));
	
	}

	public void ingresadatosdoc(String tipodoc, String numdoc) {
		numdoc="1039884038";
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//select[@id='formBuscar:tipoDocSel']/option[@value='CC']")).click();
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//input[@id='formBuscar:numDocTxt']")).sendKeys(numdoc);
		
	}

	public void clicBotonB() {
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//button[@id='formBuscar:btnBuscar']")).click();
				
	}

	public void veinfestu() {
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"detalleInfo_content\"]/div/div[2]/table/tbody/tr[1]/td[2]")).click();
		
		
	}

	public void selopcmante() {
		menMantenimiento.click();
		
	}

	public void selitempresu() {
		opcitempres.click();
		
	}

	public void buscapalabra(String palabraitem) {
		palabraitem="Costos";
		textitem.sendKeys(palabraitem);
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"contWrapper\"]/form/table[1]/tbody/tr[2]/td/p/a/img")).click();
	}

	public void vetabla() {
				assertThat  (tablapal.getText(),containsString("Costos"));
	}

	public void veopcambiodcto() {
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"menu-lateral\"]/div[2]/a[3]")).click();
		
	}

	public void tynantes(String tip_ant, String num_ant) {
		tipantes.click();
		tipantes.selectByValue(tip_ant);
		numantes.sendKeys(num_ant);
	}

	public void tyndps(String tip_des, String num_des) {
		tipdes.click();
		tipdes.selectByValue(tip_des);
		numdes.sendKeys(num_des);
		
	}

	public void botones() {
		
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"contWrapper\"]/form/table/tbody/tr[2]/td/a[1]/input")).click();
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"contWrapper\"]/form/table/tbody/tr[2]/td/a[2]/input")).click();
	
		
	}

	public void vemenscambio() {
		getDriver().switchTo().alert();
		Alert alert = getDriver().switchTo().alert();
		alert.accept();
		assertThat(msjregexitoso.getText(),containsString("Se ha cambiado"));

	}
	

	public void opcdatobasic() {
		mendatclient.click();
		//System.out.print(mendatclient);
	
	}

	public void ingresaTyN(String tipCl, String numCl) {
		lsttipcl.selectByValue(tipCl);
		txtnumcl.sendKeys(numCl);
		
	
		
	}


	public boolean validainfocliente() {
		btnbusclie.click();
		String nombrep=nombre.getValue();
		if( nombrep.isEmpty())
			
		{return false;}	
		  return true;
	
	
	
		
	}

	public void opRegClien() {
		opRegcliente.click();
		
	}

	public boolean vedatocli() {
		btnbusclieR.click();
		
		if( nombremostrado.getTextValue().isEmpty())
			
		{return false;}	
		  return true;
	}

	public void ingresodatosform(String nom, String ape, String gen) {
		btnbusclieR.click();
		nombre.clear();
		nombre.sendKeys(nom);
		txtapellido.clear();
		txtapellido.sendKeys(ape);
		lstgenero.selectByValue(gen);
		lstcodpais.selectByValue("20");
		lstcoddpto.selectByValue("05");
		lstcodciu.selectByValue("001");
		String Tipdocu= lsttipcl.getValue();
		if( Tipdocu.equals("TI") || Tipdocu.equals("RE") )
		{	Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"detalleBasicos\"]/table/tbody/tr[21]/td[2]/input")).sendKeys("123455");
		//System.out.print("tipo doc entro:" + Tipdocu);
		}
		//System.out.print("tipo doc:" + Tipdocu);
		btnguardarfrm.click();
		
		
		
		
	}

	public void validamsjexito(String mensajeregesxito) {
		
		mensajeregesxito= "Se ha realizado la acción con éxito";
		assertThat(msjregexitoso.getText(), containsString(mensajeregesxito));
		
			}
	
	}

	 
