package com.Controladores;

import com.Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorTemperatura extends JFrame implements ActionListener{
    private VistaTemperatura vista;
    private double valor;

    public ControladorTemperatura(VistaTemperatura vista, double valor) {
        this.vista = vista;
        this.valor = valor;
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Temperatura");
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
        	if(vista.jcbSeleccionar.getSelectedItem()=="De Celsius a Fahrenheit") {        		
        		operaciones.OperacionTemperatura(valor, "CF", "Fahrenheits");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Celsius a Kelvin"){
        		operaciones.OperacionTemperatura(valor, "CK", "Kelvins");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Fahrenheit a Celsius"){
        		operaciones.OperacionTemperatura(valor, "FC", "Celsius");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Fahrenheit a Kelvin"){
        		operaciones.OperacionTemperatura(valor, "FK", "Kelvins");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Kelvin a Celsius"){
        		operaciones.OperacionTemperatura(valor, "KC", "Celsius");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Kelvin a Fahrenheit"){
        		operaciones.OperacionTemperatura(valor, "KF", "Fahrenheits");
        		
        	}else {
        		JOptionPane.showMessageDialog(vista, "Ingrese una opcion");
        	}
        }
    }
}
