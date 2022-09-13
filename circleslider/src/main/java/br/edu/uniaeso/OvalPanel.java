package br.edu.uniaeso;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OvalPanel extends JPanel {
    private int diameter;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10, 10, getDiameter(), getDiameter());
    }

    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }

    public Dimension getMinimumSize(){
        return getPreferredSize();
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = (diameter >= 0 ? diameter : 10);
        repaint();
    }

}
