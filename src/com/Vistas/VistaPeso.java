package com.Vistas;

import com.Diseño.*;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class VistaPeso extends JFrame{
    private JLabelDiseño jlbElije;
    public JComboBoxDiseño jcbSeleccionar;
    public JButtonGradient jbtnOk, jbtnCancelar;

    public VistaPeso() {
        setLayout(null);
        setSize(500,210);
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
        add(jcbSeleccionar);
        jcbSeleccionar.addItem("De Kilogramo a Libra");
        jcbSeleccionar.addItem("De Kilogramo a Onza");
        jcbSeleccionar.addItem("De Libra a Kilogramo");
        jcbSeleccionar.addItem("De Libra a Onza");
        jcbSeleccionar.addItem("De Onza a Kilogramo");
        jcbSeleccionar.addItem("De Onza a Libra");
        
        JPanel panel = new JPanelGradient();
		panel.setBounds(0, 0, 500,210);
		getContentPane().add(panel);
		panel.setLayout(null);

        
    	jlbElije = new JLabelDiseño("Elije la unidad de peso a la que deseas convertir la actual");
        
        
        jbtnOk = new JButtonGradient("OK");
        jbtnCancelar = new JButtonGradient("Cancel");

        panel.add(jlbElije);
        jlbElije.setBounds(20,20,500,20);

        
        

        panel.add(jbtnOk);
        jbtnOk.setBounds(60,100,110, 37);
        
        panel.add(jbtnCancelar);
        jbtnCancelar.setBounds(350,100,110, 37);
        
        
    }
    
}