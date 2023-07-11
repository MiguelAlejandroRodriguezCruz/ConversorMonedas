package com.Controladores;

import javax.swing.*;

import java.awt.*;
import java.text.DecimalFormat;

public class Operaciones {
	private UIManager UI;
	
	public Operaciones() {
		UI = null;
		UI.put("OptionPane.background", new Color(32,139,223));
		UI.put("Panel.background", new Color(32,139,223));
	}
	public void pesoMoneda(double valorConvertir, double valorMoneda,String tipo) {
		double resultado = valorConvertir*(valorMoneda);
		resultadoFinal(resultado, tipo,"/img/Dinero.png");
	 
	}
	public void monedaPeso(double valorConvertir, double valorMoneda,String tipo) {
		double resultado = valorConvertir/(valorMoneda);
		resultadoFinal(resultado, tipo,"/img/Dinero.png");
	
	}
	public void resultadoFinal(double resultado, String tipo, String i) {
		DecimalFormat formato = new DecimalFormat("#.##");
        String resultadoFinal = formato.format(resultado);
		JOptionPane.showMessageDialog(null, "Tienes: "+resultadoFinal+" "+tipo, "Resultado", JOptionPane.PLAIN_MESSAGE, icono(i,40,40));
		Object[] opciones = { "Yes", "No", "Cancel" };
		int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Confirmación",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		if (opcionSeleccionada == JOptionPane.YES_OPTION) {
            
        } else {
        	JOptionPane.showInternalMessageDialog(null, "Programa terminado", "Cerrar", JOptionPane.PLAIN_MESSAGE, icono("/img/Cerrar.png",40,40));
            System.exit(0);
        }
	}
	public void OperacionTemperatura(double valorConvertir,String deque,String tipo) {
		
		if(deque == "CF") {
			double resultado = (valorConvertir*1.8)+32;
			resultadoFinal(resultado, tipo,"/img/Temperatura.png");
		}else if(deque == "CK") {
			double resultado = (valorConvertir)+273.15;
			resultadoFinal(resultado, tipo,"/img/Temperatura.png");
		}else if(deque == "FC") {
			double resultado = (valorConvertir-32)*(0.555555);
			resultadoFinal(resultado, tipo,"/img/Temperatura.png");
		}else if(deque == "FK") {
			double resultado = ((valorConvertir-32)*(0.555555))+273.15;
			resultadoFinal(resultado, tipo,"/img/Temperatura.png");
		}else if(deque == "KC") {
			double resultado = valorConvertir-273.15;
			resultadoFinal(resultado, tipo,"/img/Temperatura.png");
		}else if(deque == "KF") {
			double resultado = ((valorConvertir-273.15)*(1.8))+32;
			resultadoFinal(resultado, tipo,"/img/Temperatura.png");
		}else {
			
		}
	}
	
public void OperacionPeso(double valorConvertir,String deque,String tipo) {
		
		if(deque == "KL") {
			double resultado = valorConvertir*2.20462;
			resultadoFinal(resultado, tipo,"/img/Peso.png");
		}else if(deque == "KO") {
			double resultado = valorConvertir*35.274;
			resultadoFinal(resultado, tipo,"/img/Peso.png");
		}else if(deque == "LK") {
			double resultado = valorConvertir*0.453592;
			resultadoFinal(resultado, tipo,"/img/Peso.png");
		}else if(deque == "LO") {
			double resultado = valorConvertir*16;
			resultadoFinal(resultado, tipo,"/img/Peso.png");
		}else if(deque == "OK") {
			double resultado = valorConvertir*0.0283495;
			resultadoFinal(resultado, tipo,"/img/Peso.png");
		}else if(deque == "OL") {
			double resultado = valorConvertir*0.0625;
			resultadoFinal(resultado, tipo,"/img/Peso.png");
		}else {
			
		}
	}
	public void OperacionDistancia(double valorConvertir,String deque,String tipo) {
		if(deque == "MPi") {
			double resultado = valorConvertir*3.28084;
			resultadoFinal(resultado, tipo,"/img/Distancia.png");
		}else if(deque == "MPu") {
			double resultado = valorConvertir*39.3701;
			resultadoFinal(resultado, tipo,"/img/Distancia.png");
		}else if(deque == "PiM") {
			double resultado = valorConvertir*0.3048;
			resultadoFinal(resultado, tipo,"/img/Distancia.png");
		}else if(deque == "PiPu") {
			double resultado = valorConvertir*12;
			resultadoFinal(resultado, tipo,"/img/Distancia.png");
		}else if(deque == "PuM") {
			double resultado = valorConvertir*0.0254;
			resultadoFinal(resultado, tipo,"/img/Distancia.png");
		}else if(deque == "PuPi") {
			double resultado = valorConvertir*0.0833333;
			resultadoFinal(resultado, tipo,"/img/Distancia.png");
		}else {
			
		}
	}
	
	public void OperacionAño(double valorConvertir,String deque,String tipo) {
		if(deque == "AD") {
			double resultado = valorConvertir*0.1;
			resultadoFinal(resultado, tipo,"/img/Año.png");
		}else if(deque == "AS") {
			double resultado = valorConvertir*0.01;
			resultadoFinal(resultado, tipo,"/img/Año.png");
		}else if(deque == "DA") {
			double resultado = valorConvertir*10;
			resultadoFinal(resultado, tipo,"/img/Año.png");
		}else if(deque == "DS") {
			double resultado = valorConvertir*0.1;
			resultadoFinal(resultado, tipo,"/img/Año.png");
		}else if(deque == "SA") {
			double resultado = valorConvertir*100;
			resultadoFinal(resultado, tipo,"/img/Año.png");
		}else if(deque == "SD") {
			double resultado = valorConvertir*10;
			resultadoFinal(resultado, tipo,"/img/Año.png");
		}else {
			
		}
	}
	
	public void OperacionCodigoASCII(int tipo, char valor) {
		if(tipo == 1) {
			int resultado = (char)valor;
			JOptionPane.showMessageDialog(null, "El codigo ASCII de ese simbolo es: "+resultado, "Resultado", JOptionPane.PLAIN_MESSAGE, icono("/img/Codigo.png",40,40));
		}else if(tipo == 2) {
			//String resultado = valor;
			JOptionPane.showMessageDialog(null, "El simbolo de ese codigo ASCII es: "+valor, "Resultado", JOptionPane.PLAIN_MESSAGE, icono("/img/Codigo.png",40,40));
		}else {
			
		}
	}
	
	public double ventanaDato() {
		String datoIngresado = JOptionPane.showInputDialog(null, "Ingrese un dato:");
		 double valor = 0;
		 if (datoIngresado == null ) { 
	        } else if(!datoIngresado.isEmpty()){
	        	try {
	                valor = Double.parseDouble(datoIngresado);
	                
	            } catch (NumberFormatException e1 ) {
	                JOptionPane.showMessageDialog(null, "El valor ingresado no es un número válido.", "Alert", JOptionPane.PLAIN_MESSAGE, icono("/img/Error.png",40,40));
	            }
	        }else {
	        	
	        	JOptionPane.showMessageDialog(null, "No se ingresó ningún dato.", "Alert", JOptionPane.PLAIN_MESSAGE, icono("/img/Error.png",40,40));
	        }
		 return valor;
	}
	public void ventanaProgramaTerminado() {
		
		
		JOptionPane.showInternalMessageDialog(null, "Programa terminado", "Cerrar", JOptionPane.PLAIN_MESSAGE, icono("/img/Cerrar.png",40,40));
		
        System.exit(0);
	}
	public Icon icono(String string, int i, int j) {
		Icon img = new ImageIcon(new ImageIcon(getClass().getResource(string)).getImage().getScaledInstance(i, j, Image.SCALE_SMOOTH));
		
		return img;
	}
	
	
}
