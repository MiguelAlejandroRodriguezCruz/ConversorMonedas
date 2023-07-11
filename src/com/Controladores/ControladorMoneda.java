package com.Controladores;

import com.Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControladorMoneda extends JFrame implements ActionListener{
    private VistaMoneda vista;
    private double valor;
    private double valorDolar;
    private double valorEuro;
    private double valorLibra;
    private double valorYen;
    private double valorWon;
    public String tipoMoneda;
    public ControladorMoneda(String tipoMoneda,String baseMoneda,VistaMoneda vista, double valor) {
    	this.tipoMoneda = tipoMoneda;
        this.vista = vista;
        this.valor = valor;
        ObtenerValorMoneda moneda = new ObtenerValorMoneda();
        double valorMoneda[]= moneda.valorMooneda(baseMoneda);
        this.valorDolar = valorMoneda[0];
        this.valorEuro = valorMoneda[1];
        this.valorLibra = valorMoneda[2];
        this.valorYen = valorMoneda[3];
        this.valorWon = valorMoneda[4];
        //escuchar los clics sobre los botones de la vista
        this.vista.jbtnOk.addActionListener(this);
        this.vista.jbtnCancelar.addActionListener(this);
        
    }
    
    public void iniciarVista (){
        vista.setTitle("Moneda");
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.jbtnCancelar){
        	VistaTiposMonedas vista = new VistaTiposMonedas();
 	       ControladorTiposMoneda controlador = new ControladorTiposMoneda(vista);
 	       controlador.iniciarVista();
 	      this.vista.dispose();
        }
        if(e.getSource()==vista.jbtnOk) {
        	Operaciones operaciones = new Operaciones();
        	int indice;
        	if(vista.jcbSeleccionar.getSelectedIndex()==0) {        		
        		operaciones.pesoMoneda(valor, valorDolar,"Dolares");
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==1){
        		operaciones.pesoMoneda(valor, valorEuro,"Euros");
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==2){
        		operaciones.pesoMoneda(valor, valorLibra,"Libras");
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==3){
        		operaciones.pesoMoneda(valor, valorYen,"Yenes");
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==4){
        		operaciones.pesoMoneda(valor, valorWon,"Wones");
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==5){
        		
        		operaciones.monedaPeso(valor, valorDolar,tipoMoneda );
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==6){
        		
        		operaciones.monedaPeso(valor, valorEuro,tipoMoneda);
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==7){
        		
        		operaciones.monedaPeso(valor, valorLibra,tipoMoneda);
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==8){
        		
        		operaciones.monedaPeso(valor, valorYen,tipoMoneda);
        		
        	}else if(vista.jcbSeleccionar.getSelectedIndex()==9){
        		
        		operaciones.monedaPeso(valor, valorWon,tipoMoneda);
        		
        	}else {
        		JOptionPane.showMessageDialog(vista, "Ingrese una opcion");
        	}
        }
    }

    

  
    
}
