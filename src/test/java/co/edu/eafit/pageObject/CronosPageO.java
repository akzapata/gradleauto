package co.edu.eafit.pageObject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


import java.text.ParseException;

@DefaultUrl ("http://tapproyecto.eafit.edu.co/cronos/")

public class CronosPageO extends PageObject {

	
	@FindBy(xpath="//*[@id=\"j_idt40:inputUser\"]" )
	public WebElementFacade txtusr;
	
	@FindBy(xpath="//*[@id=\"j_idt40:inputPass\"]" )
	public WebElementFacade txtpwrd;
	
	@FindBy(xpath="//*[@id=\"j_idt40:loginBtn\"]/span" )
	public WebElementFacade bntingreso;
	
	@FindBy(xpath="//*[@id=\"messages\"]/div/ul/li/span" )
	public WebElementFacade msjbienvenida;
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a" )
	public WebElementFacade menproveedores;
	
	@FindBy(xpath="//*[@id=\"menu-lateral\"]/div[2]/a[2]" )
	public WebElementFacade opceditaprovedores;
	
	@FindBy(xpath="//*[@id=\"formData:proveedoresNit_input\"]" )
	public WebElementFacade txtnitprov;
	
	@FindBy(xpath="//span[@class='ui-button-text ui-c' and text()='Guardar']" )
	public WebElementFacade btnguardarprov;
	
	@FindBy(xpath="//*[@id=\"formData:proveedoresNit_panel\"]" )
	public WebElementFacade lstproveedores;
	
	@FindBy(xpath="//input[@name='formData:telefonoF']" )
	public WebElementFacade lstdats;
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a" )
	public WebElementFacade menservicios;
	
	@FindBy(xpath="//*[@id=\"menu-lateral\"]/div[2]/a[1]" )
	public WebElementFacade oprequerimiento;
	
	@FindBy(xpath="//*[@id=\"menu-lateral\"]/div[2]/a[1]" )
	public WebElementFacade opcsolicitarreq;
	
	@FindBy(xpath="//*[@id=\"formServicio:servicio_input\"]" )
	public WebElementFacade txtservicio;
	
	@FindBy(xpath="/html/body/div[9]/table/tbody/tr[1]/td" )
	public WebElementFacade lstservicios;
	
	@FindBy(xpath="//*[@id=\"formServicio:j_idt112\"]" )
	public WebElementFacade txtdescripcion;
	
	@FindBy(xpath="//*[@id=\"formServicio:centroCostos_input\"]" )
	public WebElementFacade txtcentrocostos;
	
	@FindBy(xpath="/html/body/div[21]/table/tbody/tr[1]/td" )
	public WebElementFacade lstcentrocostos;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[5]/form[2]/div[1]/div/div/div/div[5]/div[2]/div[2]/select" )
	public WebElementFacade lstordenador;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[1]/div/div/ul/li/span" )
	public WebElementFacade msjreqcreado;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/nav/div/form/div/ul/li[3]/a" )
	public WebElementFacade menbienes;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/a[1]" )
	public WebElementFacade opcrequerimientos;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/a[4]" )
	public WebElementFacade opclstarequerimientos;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[5]/div[1]/div/div/form/div/div[1]/div[2]/span/input" )
	public WebElementFacade datapickercalendario;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[5]/div[1]/div/div/form/div/div[1]/div[4]/span/input" )
	public WebElementFacade datapickercalendario2;
		
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/a[1]/span" )
	public WebElementFacade fechaizquierda;
	
	@FindBy(xpath="//*[@id=\"formData:fechaHastaF_input\"]" )
	public WebElementFacade fechaizquierdahasta;
	
	@FindBy(xpath="//*[@id=\"formData:consultarRequerimiento\"]/span[2]" )
	public WebElementFacade btnconsultarreq;
	
	@FindBy(xpath="//*[@id=\"menu-lateral\"]/div[2]/a[1]" )
	public WebElementFacade opcsolreqbienes;
	
	@FindBy(xpath="//*[@id=\"formBienes:productos_input\"]" )
	public WebElementFacade txtreqbien;
	
	@FindBy(xpath="//*[@id=\"formBienes:productos_panel\"]/table/tbody/tr[1]/td" )
	public WebElementFacade lstrequbien;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[5]/form[2]/div[1]/div/div/div/div[5]/div[2]/select" )
	public WebElementFacade lstordenadorb;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[1]/div/div/ul/li/span" )
	public WebElementFacade msjbienes;
	
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div[5]/div[1]/form/table/tbody/tr[2]/td[2]/span/input[1]" )
	public WebElementFacade txtcc;
	
	@FindBy(xpath="//*[@id=\"confirmarBienesRecurrentesForm:tablaOrdenes_data\"]/tr[1]/td[2]" )
	public WebElementFacade tbmensaje;
	
	@FindBy(xpath="" )
	public WebElementFacade msjprov;
	
	public void login(String user, String password) {
		txtusr.sendKeys(user);
		txtpwrd.sendKeys(password);
		bntingreso.click();
		
	}

	public void vepaginacronos() {
		msjbienvenida.isCurrentlyVisible();
		
		
	}

	public void menproveedores() {
		menproveedores.click();
		opceditaprovedores.click();
		
	}

	public void editproveedor() throws InterruptedException {
	   
		txtnitprov.sendKeys("890900608");
		Thread.sleep(20000);
		lstproveedores.waitUntilVisible();
		lstproveedores.click();
		txtnitprov.sendKeys(Keys.ENTER);
		Thread.sleep(25000);
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"formData:telefonoF\"]")).clear();
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div/div[5]/div/div/div/form/div[1]/table[1]/tbody/tr[1]/td[3]/input")).sendKeys("3197289");;
		btnguardarprov.waitUntilClickable();
		btnguardarprov.click();
	
		


		//Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@id=\"formData:j_idt146\"]/span[2]")).click();
	}

	public void vemenactualiza() throws InterruptedException {
		getDriver().manage().window().fullscreen();
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("/html/body/div[9]/div[3]/button[1]")).click();
		Thread.sleep(1000);
		String msj=getDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/ul/li/span")).getText();
		assertThat(msj,containsString("El proveedor ha sido ed")); 
	
	   
	}

	public void mensolrequerimiento() {
		menservicios.click();
		oprequerimiento.click();
		
	}

	public void opccrearrequeriemitno() {
		opcsolicitarreq.click();
		
	}

	public void ingresodatos() throws InterruptedException {
		txtservicio.sendKeys("carg");
		lstservicios.waitUntilVisible();
		lstservicios.click();
		Thread.sleep(700);
		txtdescripcion.sendKeys("Decripcion prueba");
		txtcentrocostos.sendKeys("150115");
		lstcentrocostos.click();
	    Thread.sleep(700);
		lstordenador.click();
		lstordenador.selectByIndex(2);
		Thread.sleep(700);
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div/div[5]/form[2]/div[1]/div/div/div/div[10]/button[1]/span[2]")).click();
		Thread.sleep(700);
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("/html/body/div[19]/div[3]/button[1]/span[2]")).click();
	}

	public void vemensajecrea() {
			assertThat(msjreqcreado.getText(), containsString("Se ha guardado de"));
		
		
		
	}

	public void menBienes() {
		menbienes.click();
		
	}

	public void opclstareq() {
		opcrequerimientos.click();
		opclstarequerimientos.click();
		
	}

	public void ingresafechas(String fechad, String fechah) throws ParseException {
		datapickercalendario.click();
		int i=4;
				
		long monthsBetween = ChronoUnit.MONTHS.between(LocalDate.parse(fechad).withDayOfMonth(1),LocalDate.now().withDayOfMonth(1));//fecha actual
		int monthnumber = (int) (monthsBetween);
		for (int j = 0; j < monthnumber; j++) 
		{
			fechaizquierda.click();		
		}
		Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr[" + i + "]/td[" + i + "]")).click();
	
		
		datapickercalendario.click();
		
		long monthsBetween2 = ChronoUnit.MONTHS.between(LocalDate.parse(fechah).withDayOfMonth(1),
				LocalDate.now().withDayOfMonth(1));//fecha actual
				int monthnumber2 = (int) (monthsBetween2);
				for (int j = 0; j < monthnumber2; j++) 
				{
					fechaizquierda.click();		
				}
				Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//*[@class='ui-datepicker-calendar']/tbody/tr[" + i + "]/td[" + i + "]")).click();
						btnconsultarreq.click();
	
	}
	
		public void opreqbienes() {
			opcsolreqbienes.click();
			opcrequerimientos.click();
			opcsolreqbienes.click();
		}
	
		public void ingrdatosreqbienes() throws InterruptedException {
			txtreqbien.click();
			txtreqbien.sendKeys("jabon");
			lstrequbien.click();
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("//input[@name='formBienes:cantidad_input']")).sendKeys("2");
			Thread.sleep(700);
			Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//input[@name='formBienes:centroCostos_input']")).click();
			Thread.sleep(1000);
			Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("//input[@name='formBienes:centroCostos_input']")).sendKeys("1501");
			Thread.sleep(1000);
			Serenity.getWebdriverManager().getCurrentDriver().findElement(By.xpath("/html/body/div[22]/table/tbody/tr[1]/td")).click();
			Thread.sleep(1000);
			lstordenadorb.selectByIndex(2);
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div/div[5]/form[2]/div[1]/div/div/div/div[8]/button[1]")).click();
			Thread.sleep(1000);
		}
	
		public void vemsjbienes() throws InterruptedException {
			getDriver().findElement(By.xpath("/html/body/div[20]/div[3]/button[1]/span[2]")).click();
			Thread.sleep(1000);
			assertThat(msjbienes.getText(), containsString("Se ha guardado de"));
			
		}
	
		public void opcbienesrecur() {
			opcrequerimientos.click();
			getDriver().findElement(By.xpath("//*[@id=\"menu-lateral\"]/div[2]/a[7]")).click();
	
		}
	
		public void ingresadatbienrec() throws InterruptedException {
			txtcc.click();
			txtcc.sendKeys("1501");
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("/html/body/div[10]/ul/li[1]")).click();
			Thread.sleep(1000);
			getDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div/div[5]/div[1]/form/table/tbody/tr[5]/td/div/button/span[2]")).click();
			Thread.sleep(1000);
		}
	
		public void veregtabla() {
			Assert.assertNotNull(tbmensaje.getTextValue());
			
		}

		public void vereqtabla() throws InterruptedException {
			 String datotblreq=getDriver().findElement(By.xpath("/html/body/div[4]/div[2]/div/div[5]/div[1]/div/div/div/form/h5/div/div[2]/table/tbody/tr[1]/td[3]")).getText();
			 Thread.sleep(1000);
			 Assert.assertNotNull(datotblreq);
			 //OutcomeFormat format = OutcomeFormat.XML;
			// TestOutcomes outcomes = TestOutcomeLoader.loadTestOutcomes().inFormat("pdf");
		}
		
	
		
	}