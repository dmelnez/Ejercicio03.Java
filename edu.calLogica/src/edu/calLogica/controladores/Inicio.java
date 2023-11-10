package edu.calLogica.controladores;

import java.util.Scanner;

import edu.calLogica.servicios.CalculoImplementacion;
import edu.calLogica.servicios.CalculoInterfaz;
import edu.calLogica.servicios.MenuImplementacion;
import edu.calLogica.servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 Scanner seleccionUsu = new Scanner (System.in);
	 
	 int valorSel = seleccionUsu.nextInt();
	 Scanner numeroUsu = new Scanner (System.in);
	 
	 MenuInterfaz mi01 = new MenuImplementacion ();
	 
	 CalculoInterfaz mi02 = new CalculoImplementacion();
	 
	 String igualdad = mi02.igualdad();
	 String desigualdad = mi02.desigualdad();
	 
	 boolean cerrarMenu = false;
	 
	 while (!cerrarMenu) 
	 {
		 switch (valorSel)
		 {
		 
		 case 0:
			 String texto01C = numeroUsu.next();
			 String texto02C = numeroUsu.next();
			 System.out.println(texto01C.equals(texto02C));			 
			 break;
			 
			 
		 case 1:
			 String texto01D = numeroUsu.next();
			 String texto02D = numeroUsu.next();
			 System.out.println(texto01D.equals(texto02D));				 
			 break;
				 
		default:
			System.out.println("Seleccion No Valida");
			break;
		 		 
		 }		 		 		 		 
	 }
	 
		
	}

}
