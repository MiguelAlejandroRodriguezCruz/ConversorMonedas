package com.Main;

import com.Controladores.*;
import com.Vistas.VistaMenu;

public class Main {

	public static void main(String[] args) {
		
		   VistaMenu vista = new VistaMenu();
	       ControladorMenu controlador = new ControladorMenu(vista);
	        
	       controlador.iniciarVista();
	       
	}
	
	
	

}
