package com.Controladores;

import com.Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorPeso extends JFrame implements ActionListener{
    private VistaPeso vista;
    private double valor;

    public ControladorPeso(VistaPeso vista, double valor) {
        this.vista = vista;
        this.valor = valor;
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Peso");
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
        	if(vista.jcbSeleccionar.getSelectedItem()=="De Kilogramo a Libra") {        		
        		operaciones.OperacionPeso(valor, "KL", "Libras");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Kilogramo a Onza"){
        		operaciones.OperacionPeso(valor, "KO", "Onzas");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Libra a Kilogramo"){
        		operaciones.OperacionPeso(valor, "LK", "Kilogramos");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Libra a Onza"){
        		operaciones.OperacionPeso(valor, "LO", "Onzas");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Onza a Kilogramo"){
        		operaciones.OperacionPeso(valor, "OK", "Kilogramos");
        		
        	}else if(vista.jcbSeleccionar.getSelectedItem()=="De Onza a Libra"){
        		operaciones.OperacionPeso(valor, "OL", "Libras");
        		
        	}else {
        		JOptionPane.showMessageDialog(vista, "Ingrese una opcion");
        	}
        }
    }
}
