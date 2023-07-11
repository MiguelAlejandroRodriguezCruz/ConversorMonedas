package com.Controladores;

import com.Vistas.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ControladorCodigoAscii extends JFrame implements ActionListener{
    private VistaCodigoAscii vista;
    

    public ControladorCodigoAscii(VistaCodigoAscii vista) {
        this.vista = vista;
       
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk1.addActionListener(this);
        this.vista.jbtnOk2.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Codigo ASCII");
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
        if(e.getSource()==vista.jbtnOk1) {
        	String obtenido = vista.jtxSimbolo.getText();
        	if(obtenido.length() == 1 && obtenido != null) {
        		char valor = obtenido.charAt(0);
        		Operaciones operaciones = new Operaciones();
            	operaciones.OperacionCodigoASCII(1, valor);
        	}else {
        		JOptionPane.showMessageDialog(null, "Ingrese un simbolo valido", "Alert", JOptionPane.PLAIN_MESSAGE, icono("/img/Error.png",40,40));
        	}
        	
        }
        if(e.getSource()==vista.jbtnOk2) {
        	String obtenido = vista.jtxCodigo.getText();
        	try {
        		int val = Integer.parseInt(obtenido);
        		char valor = (char) val;
        		Operaciones operaciones = new Operaciones();
            	operaciones.OperacionCodigoASCII(2, valor);
        	}catch (Exception e1) {
        		JOptionPane.showMessageDialog(null, "El valor ingresado no es un Codigo valido", "Alert", JOptionPane.PLAIN_MESSAGE, icono("/img/Error.png",40,40));
			}
        	
        	
        }
    }
    public Icon icono(String string, int i, int j) {
		Icon img = new ImageIcon(new ImageIcon(getClass().getResource(string)).getImage().getScaledInstance(i, j, Image.SCALE_SMOOTH));
		
		return img;
	}
}