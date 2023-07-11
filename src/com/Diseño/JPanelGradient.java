package com.Diseño;

import java.awt.*;
import javax.swing.JPanel;

public class JPanelGradient extends JPanel{
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		int width = getWidth();
		int height = getHeight();
		
		Color color1 = new Color(255, 0, 0);
		Color color2 = new Color(0, 0, 255);
		GradientPaint gp = new GradientPaint(0, 0,color1,180,height,color2);
		g2d.setPaint(gp);
		g2d.fillRect(0, 0, width, height);
	}
}
