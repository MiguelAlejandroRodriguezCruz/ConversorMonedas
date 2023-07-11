package com.Controladores;

import com.Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorAño extends JFrame implements ActionListener{
    private VistaAño vista;
    private double valor;

    public ControladorAño(VistaAño vista, double valor) {
        this.vista = vista;
        this.valor = valor;
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Tiempo");
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnCancelar){
        	VistaMenu vista = new VistaMenu();
 	       ControladorMenu controlador = new ControladorMenu(vista);
 	       controlador.iniciarVista();
 	      this.vista.dispose();
        }
        if(e.getSource()==vista.jbtnOk) {
        	Operaciones operaciones = new Operaciones();
        	if(vista.jcbSeleccionar.getSelectedItem()=="De Año a Decada") {        		
        		operaciones.OperacionAño(valor, "AD", "Decadas");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Año a Siglo"){
        		operaciones.OperacionAño(valor, "AS", "Siglos");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Decada a Año"){
        		operaciones.OperacionAño(valor, "DA", "Años");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Decada a Siglo"){
        		operaciones.OperacionAño(valor, "DS", "Siglos");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Siglo a Año"){
        		operaciones.OperacionAño(valor, "SA", "Años");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Siglo a Decada"){
        		operaciones.OperacionAño(valor, "SD", "Decadas");
        		
        	}else {
        		JOptionPane.showMessageDialog(vista, "Ingrese una opcion");
        	}
        }
    }
}