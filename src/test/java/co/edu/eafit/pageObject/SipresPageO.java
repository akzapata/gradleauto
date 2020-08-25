package co.edu.eafit.pageObject;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("http://tapproyecto.eafit.edu.co/sipres/")

public class SipresPageO extends PageObject {
	
	@FindBy(name="login" )
	public WebElementFacade txtusr;
	
	@FindBy(id="inputPassword" )
	public WebElementFacade txtclav;
	
	@FindBy(xpath="/html/body/form/div[2]/input[4]")
	public WebElementFacade btingreso;
	
	@FindBy( xpath = "//*[@id=\"cabezote\"]/div/div/ul/li/a" )
	public WebElementFacade txtppal;

	public void ingresocredenciales() {
		txtusr.click();
		txtclav.click();
		btingreso.click();
		
	}
	
}
