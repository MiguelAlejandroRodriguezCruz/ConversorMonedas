package com.Vistas;

import com.Diseño.*;
import java.awt.*;
import javax.swing.*;

public class VistaMoneda extends JFrame{
    private JLabelDiseño jlbElije;
    public JComboBoxDiseño jcbSeleccionar;
    public JButtonGradient jbtnOk, jbtnCancelar;
    public String tipoMoneda;
    public VistaMoneda(String tipoMoneda) {
    	this.tipoMoneda = tipoMoneda;
        setLayout(null);
        setSize(500,210);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.blue);
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
        jcbSeleccionar.addItem("De " + tipoMoneda + " a Dólar");
        jcbSeleccionar.addItem("De " + tipoMoneda + " a Euro");
        jcbSeleccionar.addItem("De " + tipoMoneda + " a Libras");
        jcbSeleccionar.addItem("De " + tipoMoneda + " a Yen");
        jcbSeleccionar.addItem("De " + tipoMoneda + " a Won Coreano");
        jcbSeleccionar.addItem("De Dólar a "+ tipoMoneda);
        jcbSeleccionar.addItem("De Euro a "+ tipoMoneda);
        jcbSeleccionar.addItem("De Libras a "+ tipoMoneda);
        jcbSeleccionar.addItem("De Yen a "+ tipoMoneda);
        jcbSeleccionar.addItem("De Won Coreano a "+ tipoMoneda);
        
        JPanel panel = new JPanelGradient();
		panel.setBounds(0, 0, 500,210);
		getContentPane().add(panel);
		panel.setLayout(null);

    	jlbElije = new JLabelDiseño("Elije la moneda a la que deseas convertir tu dinero");
        
        
        jbtnOk = new JButtonGradient("OK");
        jbtnCancelar = new JButtonGradient("Cancel");

        panel.add(jlbElije);
        jlbElije.setBounds(50,20,400,20);
        
        panel.add(jbtnOk);
        jbtnOk.setBounds(60,100,110, 37);
        
        panel.add(jbtnCancelar);
        jbtnCancelar.setBounds(350,100,110, 37);
        
        
    }
    
}