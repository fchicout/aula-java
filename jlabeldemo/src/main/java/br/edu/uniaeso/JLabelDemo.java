package br.edu.uniaeso;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemo extends JFrame {
    private JLabel label1;

    public JLabelDemo() {
        super("Demonstração JLabel");
        configureJLabel1();
        addToContainer(getLabel1());

        setSize(300, 200);
        setVisible(true);
    }

    private void configureJLabel1(){
        label1 = new JLabel();
        label1.setText("Um texto de exemplo");
        label1.setToolTipText("O que vc está procurando aqui??");
    }

    private void addToContainer(Component comp){
        getContentPane().add(comp);
    }
    
    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

}
