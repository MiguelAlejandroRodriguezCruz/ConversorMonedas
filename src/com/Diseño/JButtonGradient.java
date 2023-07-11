package com.Diseño;

import java.awt.*;
import javax.swing.JButton;

public class JButtonGradient extends JButton {
    public JButtonGradient(String text) {
        super(text);
        setContentAreaFilled(false);

        setForeground(Color.WHITE);

        Font font = new Font("Comic Sans MS", Font. BOLD, 15);
        setFont(font);
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();

        Color color1 = new Color(255, 0, 0);
        Color color2 = new Color(0, 255, 0);
        GradientPaint gp = new GradientPaint(0, 0, color1, width, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);

        g2d.dispose();
        super.paint(g);
    }
}
