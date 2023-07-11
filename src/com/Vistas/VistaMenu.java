package com.Vistas;

import com.Diseño.*;
import java.awt.*;
import javax.swing.*;


public class VistaMenu extends JFrame{
    private JLabel jlbMenu;
    public JComboBoxDiseño jcbSeleccionar;
    public JButtonGradient jbtnOk,jbtnCancelar; 

    public VistaMenu() {
        setLayout(null);
        setSize(500,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        setIconImage(getIconImage());
    }
    @Override
	public Image getIconImage() {
		Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Conversor.png"));
		return retValue;
	}
    private void iniciarComponentes() {
    	jcbSeleccionar = new JComboBoxDiseño();
    	getContentPane().add(jcbSeleccionar);
    	
  
        jcbSeleccionar.setBounds(100,60,300,20);
        jcbSeleccionar.insertItemAt("Seleccione una opcion de convercion", 0);
        jcbSeleccionar.setSelectedIndex(0);
        add(jcbSeleccionar);
        jcbSeleccionar.addItem("Conversor de Moneda");
        jcbSeleccionar.addItem("Conversor de Temperatura");
        jcbSeleccionar.addItem("Conversor de Peso");
        jcbSeleccionar.addItem("Conversor de Distancia");
        jcbSeleccionar.addItem("Conversor de Años");
        jcbSeleccionar.addItem("Conversor de Codigo ASCII");
    	
        JPanel panel = new JPanelGradient();
		panel.setBounds(0, 0, 500,170);
		getContentPane().add(panel);
		panel.setLayout(null);
        
        jlbMenu = new JLabel("Menu");
        jlbMenu.setFont(new Font("Comic Sans MS", Font. BOLD, 25));
        jlbMenu.setForeground(Color.white);
        
        jbtnOk = new JButtonGradient("OK");

        jbtnCancelar = new JButtonGradient("Cancel");
        
        panel.add(jlbMenu);
        jlbMenu.setBounds(225,20,100,30);
        

        panel.add(jbtnOk);
        jbtnOk.setBounds(60,100, 110, 37);
        
        
        panel.add(jbtnCancelar);
        jbtnCancelar.setBounds(350,100,110, 37);
        
        
        
    }
    
}
