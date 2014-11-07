/**
 * 
 */
package administrativo;

import java.*;
import java.util.ArrayList;


public class Administrador {
	
	private ArrayList<Procedimientos> listaProcedimientos = new ArrayList<Procedimientos>();
	

	public Administrador() {
		
	}

	private void registrarProcedimientos(String pTipo, String pNombreP)
	{
		Procedimientos procedimiento = new Procedimientos();
		procedimiento.setTipo(pTipo);
		procedimiento.setNombre(pNombreP);
		listaProcedimientos.add(procedimiento);
	}
	
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico medico = new Medico();
		medico.registrarMedico("olman", "11-11-12345678", "ol.a@hotmail","tuanis", "cardiologo", "centro de salud TEC", "chino", "colegioS.A","dental", "sacar una muela", 150000,"master en pokemon", "Liga pokemon", "ciudad paleta", "15/15/15");
		
		medico.registrarEspecialidad("oftal");
		medico.registrarCentroMedico("Hospital mexico");
		//medico.registrarProcedimientos("dental", "sacar una muela", 150000);
		//medico.registrarProcedimientos("emergencia", "curar pie", 770000);
		//medico.registrarEducacion("master en pokemon", "Liga pokemon", "ciudad paleta", "15/15/15");
		//medico.registrarEducacion("copero profecional", "U copera", "puntarenas", "17/17/17");
		
		Medico medico2 = new Medico();
		medico2.registrarMedico("fabr", "7777777", "fb.a@hotmail","hola", "medico general", "clinica biblica", "franses", "colegio oriental","cirugia", "arreglar cara", 700000000,"cirujano", "ucr", "C.R", "7/7/7");
		
		
		System.out.println(" ");
		System.out.println(" ");
		mostrarMedicos();
		System.out.println(" ");
		System.out.println(" ");
		
		
	}*/

}
