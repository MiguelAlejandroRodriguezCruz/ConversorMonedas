package com.Controladores;

import com.Vistas.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ControladorMenu extends JFrame implements ActionListener{
    private VistaMenu vista;
   

    public ControladorMenu(VistaMenu vista) {
        this.vista = vista;
        
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);

    }
    
    public void iniciarVista (){
        vista.setTitle("Menu");
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	Operaciones operaciones = new Operaciones();
        if(e.getSource()==vista.jbtnCancelar){
            operaciones.ventanaProgramaTerminado();
        }
        if(e.getSource()==vista.jbtnOk) {
        	
        	if(vista.jcbSeleccionar.getSelectedItem()=="Conversor de Moneda") {
        		
        		
        			VistaTiposMonedas vista = new VistaTiposMonedas ();
        			ControladorTiposMoneda controlador = new ControladorTiposMoneda(vista);
        			controlador.iniciarVista();
     	             this.vista.dispose();
        		
        		 
           
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="Conversor de Temperatura"){
        		
        		double valor = operaciones.ventanaDato();
        		if(valor != 0) {
       	                VistaTemperatura vista = new VistaTemperatura();
                 	       ControladorTemperatura controlador = new ControladorTemperatura(vista, valor);
                 	       controlador.iniciarVista();
                 	       this.vista.dispose();
        		}
       		 
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="Conversor de Peso"){
        		double valor = operaciones.ventanaDato();
        		if(valor != 0) {
       	                VistaPeso vista = new VistaPeso();
                 	       ControladorPeso controlador = new ControladorPeso(vista, valor);
                 	       controlador.iniciarVista();
                 	       this.vista.dispose();
        		}
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="Conversor de Distancia"){
        		double valor = operaciones.ventanaDato();
        		if(valor != 0) {
       	                VistaDistancia vista = new VistaDistancia();
                 	       ControladorDistancia controlador = new ControladorDistancia(vista, valor);
                 	       controlador.iniciarVista();
                 	       this.vista.dispose();
        		}
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="Conversor de Años"){
        		double valor = operaciones.ventanaDato();
        		if(valor != 0) {
        				VistaAño vista = new VistaAño();
                 	       ControladorAño controlador = new ControladorAño(vista, valor);
                 	       controlador.iniciarVista();
                 	       this.vista.dispose();
        		}
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="Conversor de Codigo ASCII"){
        		VistaCodigoAscii vista = new VistaCodigoAscii();
      	       ControladorCodigoAscii controlador = new ControladorCodigoAscii(vista);
      	       controlador.iniciarVista();
      	       this.vista.dispose();
        	}else {
        		JOptionPane.showMessageDialog(vista, "Ingrese una opcion");
        	}
        }
    }

    

  
    
}
