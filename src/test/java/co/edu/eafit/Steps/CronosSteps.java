
package co.edu.eafit.Steps;
import java.text.ParseException;

import co.edu.eafit.pageObject.CronosPageO;

public class CronosSteps  {


	CronosPageO cronosPageO;

	public void ingresocronos() {
		cronosPageO.open();
		
	}

	public void vepaginacronos() {
		cronosPageO.vepaginacronos();
		
	}

	public void ingresoapp(String user, String password) {
		cronosPageO.login(user,password);
		
	}

	public void menproveedores() {
		cronosPageO.menproveedores();
		
	}

	public void editaproveedor() throws InterruptedException {
		cronosPageO.editproveedor();
		
	}

	public void vemenactualiza() throws InterruptedException {
		cronosPageO.vemenactualiza();
		
	}

	public void mensolrequerimiento() {
		cronosPageO.mensolrequerimiento();
		
	}

	public void opccrearreq() {
		cronosPageO.opccrearrequeriemitno();
		
	}

	public void ingresodatosrequeriemiento() throws InterruptedException {
		cronosPageO.ingresodatos();
		
	}

	public void vemensajecreacion() {
		cronosPageO.vemensajecrea();
		
	}

	public void menBienes() {
		cronosPageO.menBienes();
		
	}

	public void opclstareq() {
		cronosPageO.opclstareq();
		
	}

		public void ingresafechas(String fechad, String fechah) throws ParseException {
		cronosPageO.ingresafechas(fechad,fechah);
		
		
	}

		public void opcreqbienes() {
		cronosPageO.opreqbienes();
			
		}

		public void ingresadatosreqbienes() throws InterruptedException {
		cronosPageO.ingrdatosreqbienes();
			
		}

		public void vemensajebienes() throws InterruptedException {
		cronosPageO.vemsjbienes();
			
		}

		public void opcbienesrecurrentes() {
			cronosPageO.opcbienesrecur();
			
		}

		public void ingresadatosbienrecur() throws InterruptedException {
			cronosPageO.ingresadatbienrec();
			
		}

		public void vetablaordenes() {
			cronosPageO.veregtabla();
			
		}

		public void verequerbienes() throws InterruptedException {
			cronosPageO.vereqtabla();
			
		}
}

