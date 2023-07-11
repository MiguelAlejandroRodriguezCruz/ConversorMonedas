package com.Vistas;

import com.Diseño.*;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class VistaCodigoAscii extends JFrame{
    private JLabelDiseño jlbSimbolo,jlbCodigo;
    public JTextField jtxSimbolo,jtxCodigo ;
    public JButtonGradient jbtnOk1,jbtnOk2, jbtnCancelar;

    public VistaCodigoAscii() {
        setLayout(null);
        setSize(600,200);
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
    	JPanel panel = new JPanelGradient();
		panel.setBounds(0, 0, 600,200);
		getContentPane().add(panel);
		panel.setLayout(null);
    	
    	jlbSimbolo = new JLabelDiseño("Ingrese un simbolo");
    	jlbCodigo = new JLabelDiseño("Ingrese un Codigo ASCII");
        
    	jtxCodigo = new JTextField();
    	jtxSimbolo = new JTextField();
        
        jbtnOk1 = new JButtonGradient("OK");
        jbtnOk2 = new JButtonGradient("OK");
        jbtnCancelar = new JButtonGradient("Cancel");
        
        panel.add(jtxSimbolo);
        jtxSimbolo.setBounds(65,60,50,20);

        panel.add(jtxCodigo);
        jtxCodigo.setBounds(440,60,50,20);
        
        panel.add(jlbSimbolo);
        jlbSimbolo.setBounds(25,20,400,20);
        
        panel.add(jlbCodigo);
        jlbCodigo.setBounds(380,20,400,20);

        panel.add(jbtnOk1);
        jbtnOk1.setBounds(40,100,110, 37);
        
        panel.add(jbtnOk2);
        jbtnOk2.setBounds(415,100,110, 37);
        
        panel.add(jbtnCancelar);
        jbtnCancelar.setBounds(220,100,110, 37);
        
        
    }
    
}