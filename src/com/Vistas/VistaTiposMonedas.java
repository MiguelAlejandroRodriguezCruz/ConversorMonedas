package com.Vistas;

import com.Diseño.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class VistaTiposMonedas extends JFrame {

	private JPanel contentPane;
	public JButton btnMexico,btnBrasil,btnColombia,btnArgentina,btnBolivia,btnChile,btnPanama,btnParaguay;
	public JButtonGradient btnCancelar;
	/**
	 * Launch the application.
	 */
	public VistaTiposMonedas() {
        getContentPane().setLayout(null);
        setSize(618,526);
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
	/**
	 * Create the frame.
	 */
	private void iniciarComponentes() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanelGradient();
		panel.setBounds(0, 0, 602, 487);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elija el país de la moneda que desea convertir.");
		lblNewLabel.setBounds(60, 11, 500, 42);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font. BOLD, 20));
		lblNewLabel.setForeground(Color.white);
		
		btnMexico = new JButton("");
		btnMexico.setBounds(71, 83, 113, 73);
		panel.add(btnMexico);
		ImageIcon img1 = new ImageIcon("src/img/Mexico.png");
		Icon i1 = new ImageIcon(img1.getImage().getScaledInstance(btnMexico.getWidth(), btnMexico.getHeight(), Image.SCALE_DEFAULT));
		btnMexico.setIcon(i1);
		btnMexico.setOpaque(false);
		btnMexico.setContentAreaFilled(false);
		btnMexico.setBorderPainted(false);
		
		btnPanama = new JButton("");
		btnPanama.setBounds(71, 374, 113, 73);
		panel.add(btnPanama);
		ImageIcon img2 = new ImageIcon("src/img/Panama.png");
		Icon i2 = new ImageIcon(img2.getImage().getScaledInstance(btnPanama.getWidth(), btnPanama.getHeight(), Image.SCALE_DEFAULT));
		btnPanama.setIcon(i2);
		btnPanama.setOpaque(false);
		btnPanama.setContentAreaFilled(false);
		btnPanama.setBorderPainted(false);
		
		btnColombia = new JButton("");
		btnColombia.setBounds(71, 183, 113, 68);
		panel.add(btnColombia);
		ImageIcon img3 = new ImageIcon("src/img/Colombia.png");
		Icon i3 = new ImageIcon(img3.getImage().getScaledInstance(btnColombia.getWidth(), btnColombia.getHeight(), Image.SCALE_DEFAULT));
		btnColombia.setIcon(i3);
		btnColombia.setOpaque(false);
		btnColombia.setContentAreaFilled(false);
		btnColombia.setBorderPainted(false);
		
		btnBolivia = new JButton("");
		btnBolivia.setBounds(71, 276, 113, 71);
		panel.add(btnBolivia);
		ImageIcon img4 = new ImageIcon("src/img/Bolivia.png");
		Icon i4 = new ImageIcon(img4.getImage().getScaledInstance(btnBolivia.getWidth(), btnBolivia.getHeight(), Image.SCALE_DEFAULT));
		btnBolivia.setIcon(i4);
		btnBolivia.setOpaque(false);
		btnBolivia.setContentAreaFilled(false);
		btnBolivia.setBorderPainted(false);
		
		JLabelDiseño lblNewLabel_1 = new JLabelDiseño("México");
		lblNewLabel_1.setBounds(96, 69, 68, 14);
		panel.add(lblNewLabel_1);
		
		JLabelDiseño lblNewLabel_2 = new JLabelDiseño("Colombia");
		lblNewLabel_2.setBounds(96, 167, 68, 14);
		panel.add(lblNewLabel_2);
		
		JLabelDiseño lblNewLabel_3 = new JLabelDiseño("Panama");
		lblNewLabel_3.setBounds(96, 358, 68, 14);
		panel.add(lblNewLabel_3);
		
		JLabelDiseño lblNewLabel_4 = new JLabelDiseño("Bolivia");
		lblNewLabel_4.setBounds(96, 262, 46, 14);
		panel.add(lblNewLabel_4);
		
		btnBrasil = new JButton("");
		btnBrasil.setBounds(395, 83, 113, 73);
		panel.add(btnBrasil);
		ImageIcon img5 = new ImageIcon("src/img/Brasil.png");
		Icon i5 = new ImageIcon(img5.getImage().getScaledInstance(btnBrasil.getWidth(), btnBrasil.getHeight(), Image.SCALE_DEFAULT));
		btnBrasil.setIcon(i5);
		btnBrasil.setOpaque(false);
		btnBrasil.setContentAreaFilled(false);
		btnBrasil.setBorderPainted(false);
		
		btnParaguay = new JButton("");
		btnParaguay.setBounds(395, 374, 113, 63);
		panel.add(btnParaguay);
		ImageIcon img6 = new ImageIcon("src/img/Paraguay.png");
		Icon i6 = new ImageIcon(img6.getImage().getScaledInstance(btnParaguay.getWidth(), btnParaguay.getHeight(), Image.SCALE_DEFAULT));
		btnParaguay.setIcon(i6);
		btnParaguay.setOpaque(false);
		btnParaguay.setContentAreaFilled(false);
		btnParaguay.setBorderPainted(false);
		
		btnArgentina = new JButton("");
		btnArgentina.setBounds(395, 183, 113, 68);
		panel.add(btnArgentina);
		ImageIcon img7 = new ImageIcon("src/img/Argentina.png");
		Icon i7 = new ImageIcon(img7.getImage().getScaledInstance(btnArgentina.getWidth(), btnArgentina.getHeight(), Image.SCALE_DEFAULT));
		btnArgentina.setIcon(i7);
		btnArgentina.setOpaque(false);
		btnArgentina.setContentAreaFilled(false);
		btnArgentina.setBorderPainted(false);
		
		btnChile = new JButton("");
		btnChile.setBounds(395, 276, 113, 71);
		panel.add(btnChile);
		ImageIcon img8 = new ImageIcon("src/img/Chile.png");
		Icon i8 = new ImageIcon(img8.getImage().getScaledInstance(btnChile.getWidth(), btnChile.getHeight(), Image.SCALE_DEFAULT));
		btnChile.setIcon(i8);
		btnChile.setOpaque(false);
		btnChile.setContentAreaFilled(false);
		btnChile.setBorderPainted(false);
		
		JLabelDiseño lblNewLabel_1_1 = new JLabelDiseño("Brasil");
		lblNewLabel_1_1.setBounds(426, 69, 46, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabelDiseño lblNewLabel_2_1 = new JLabelDiseño("Argentina");
		lblNewLabel_2_1.setBounds(426, 167, 82, 27);
		panel.add(lblNewLabel_2_1);
		
		JLabelDiseño lblNewLabel_3_1 = new JLabelDiseño("Paraguay");
		lblNewLabel_3_1.setBounds(426, 358, 82, 27);
		panel.add(lblNewLabel_3_1);
		
		JLabelDiseño lblNewLabel_4_1 = new JLabelDiseño("Chile");
		lblNewLabel_4_1.setBounds(426, 262, 46, 14);
		panel.add(lblNewLabel_4_1);
		
		btnCancelar = new JButtonGradient("Cancelar");
		btnCancelar.setBounds(229, 384, 110, 37);
		panel.add(btnCancelar);
	}
}
