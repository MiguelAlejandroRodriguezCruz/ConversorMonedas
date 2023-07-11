package com.Controladores;

import com.Vistas.*;
import java.awt.event.*;
import javax.swing.*;

public class ControladorTiposMoneda extends JFrame implements ActionListener{
    private VistaTiposMonedas vista;
    private double valor;

    public ControladorTiposMoneda(VistaTiposMonedas vista) {
        this.vista = vista;
        this.valor = valor;
        //escuchar los clics sobre los botones de la vista
        this.vista.btnCancelar.addActionListener(this);
        this.vista.btnMexico.addActionListener(this);
        this.vista.btnBolivia.addActionListener(this);
        this.vista.btnBrasil.addActionListener(this);
        this.vista.btnArgentina.addActionListener(this);
        this.vista.btnColombia.addActionListener(this);
        this.vista.btnChile.addActionListener(this);
        this.vista.btnPanama.addActionListener(this);
        this.vista.btnParaguay.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Moneda");
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnCancelar){
        	VistaMenu vista = new VistaMenu();
 	       ControladorMenu controlador = new ControladorMenu(vista);
 	       controlador.iniciarVista();
 	      this.vista.dispose();
        }
        Operaciones operaciones = new Operaciones();
        if(e.getSource()==vista.btnMexico) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Pesos");
             	       ControladorMoneda controlador = new ControladorMoneda("Pesos","MXN",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnBrasil) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Reales");
             	       ControladorMoneda controlador = new ControladorMoneda("Reales","BRL",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnColombia) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Pesos");
             	       ControladorMoneda controlador = new ControladorMoneda("Pesos","COP",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnArgentina) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Pesos");
             	       ControladorMoneda controlador = new ControladorMoneda("Pesos","ARS",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnBolivia) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Bolivianos");
             	       ControladorMoneda controlador = new ControladorMoneda("Bolivianos","BOB",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnChile) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Pesos");
             	       ControladorMoneda controlador = new ControladorMoneda("Pesos","CLP",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnPanama) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Balboas");
             	       ControladorMoneda controlador = new ControladorMoneda("Balboas","PAB",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }if(e.getSource()==vista.btnParaguay) {
        	double valor = operaciones.ventanaDato();
    		if(valor != 0) {
   	                VistaMoneda vista = new VistaMoneda("Guaranis");
             	       ControladorMoneda controlador = new ControladorMoneda("Guaranis","PYG",vista, valor);
             	       controlador.iniciarVista();
             	       this.vista.dispose();
    		}
        }
    }
}