package co.edu.eafit.Steps;

import org.junit.Assert;


import co.edu.eafit.pageObject.MercurioPageO;



public class MercurioStep {
	MercurioPageO mercurioPageO ;



	public void abrep() {
		mercurioPageO.open();	
	}



	public void ingresacred(String usuario, String clav) {
			mercurioPageO.ingresausr(usuario);
		mercurioPageO.ingresapw(clav);
		
	}



	public void entra() {
		mercurioPageO.clbtn();
		mercurioPageO.vepag();
		
	}



	public void veMenucarnet() {
		mercurioPageO.vemencarnet();
		
	}


	
	public void veMenuadmin() {
		mercurioPageO.vemenadmin();
		
	}


	
	public void veMenucliente() {
		mercurioPageO.vemencliente();
		
	}


	
	public void selsolmasivac() {
		mercurioPageO.selsolimasiva();
		
	}


	
	public void sellote(String lotei) {
		mercurioPageO.sellote(lotei);
		//mercurioPageO.ingresaFechas(fechad,fechah );
	
		
	}



	public void ingresafechad(String diad, String mesd, int anod) {
		//mercurioPageO.ingrfechad(diad,mesd,anod);
		mercurioPageO.ingrfechadesde(diad,mesd,anod);
		
	}


	
	public void buscarreg() {
		mercurioPageO.buscareg();
		
	}


	
	public void veregcarn() {
		mercurioPageO.Vetablacar();
		
	}


	
	public void ingresatipynum(java.lang.String tipodoc, java.lang.String numdoc) {
		mercurioPageO.ingresadatosdoc(tipodoc,numdoc );
		
	}


	
	public void busqueda() {
		mercurioPageO.clicBotonB();
		
	}


	
	public void veinfoestu() {
		mercurioPageO.veinfestu();
		
	}


	
	public void Selopcionesman() {
		mercurioPageO.selopcmante();
		mercurioPageO.selitempresu();
		
	}


	
	public void busqueda(String palabraitem) {
		mercurioPageO.buscapalabra(palabraitem);
		
	}


	
	public void vetablaitem() {
		mercurioPageO.vetabla();
		
	}



	public void cambiodcto() {
		mercurioPageO.vemenadmin();
		
	}


	
	public void opccambiodcto() {
		mercurioPageO.veopcambiodcto();
		
	}



	
	public void ingresadatoscambio(String tip_ant, String num_ant, String tip_des,String num_des) {
		mercurioPageO.tynantes(tip_ant,num_ant);
		mercurioPageO.tyndps(tip_des,num_des);
	}


	
	public void realizacambio() {
		mercurioPageO.botones();
	
		
	}



	public void vemensajecambio() {
		mercurioPageO.vemenscambio();
		
	}



		public void ingresaDclientes(String tipCl,String numCl) {
			mercurioPageO.ingresaTyN(tipCl,numCl);
			
		}



		public void ingopcbatosba() {
			mercurioPageO.opcdatobasic();
			
		}



		public void validamsjclien() {
			boolean nombreen=mercurioPageO.validainfocliente();	
			Assert.assertEquals(true, nombreen);
			 

}



		public void opRegCliente() {
			mercurioPageO.opRegClien();
			
		}



		public void vedatoscliente() {
		Assert.assertEquals(true,mercurioPageO.vedatocli());
			
		}



		public void ingresodatosform(String nom, String ape, String gen) {
			mercurioPageO.ingresodatosform(nom, ape, gen);
			
		}



		public void validamsjregistro(String mensajeregesxito) {
			mercurioPageO.validamsjexito(mensajeregesxito);
			
		}



		}