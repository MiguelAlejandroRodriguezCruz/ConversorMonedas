package com.Controladores;

import com.Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorDistancia extends JFrame implements ActionListener{
    private VistaDistancia vista;
    private double valor;

    public ControladorDistancia(VistaDistancia vista, double valor) {
        this.vista = vista;
        this.valor = valor;
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Distancia");
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
        	if(vista.jcbSeleccionar.getSelectedItem()=="De Metro a Pies") {        		
        		operaciones.OperacionDistancia (valor, "MPi", "Pies");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Metro a Pulgada"){
        		operaciones.OperacionDistancia(valor, "MPu", "Pulgadas");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Pies a Metro"){
        		operaciones.OperacionDistancia(valor, "PiM", "Metros");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Pies a Pulgada"){
        		operaciones.OperacionDistancia(valor, "PiPu", "Pulgadas");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Pulgada a Metro"){
        		operaciones.OperacionDistancia(valor, "PuM", "Metros");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Pulgada a Pies"){
        		operaciones.OperacionDistancia(valor, "PuPi", "Pies");
        		
        	}else {
        		JOptionPane.showMessageDialog(vista, "Ingrese una opcion");
        	}
        }
    }
}