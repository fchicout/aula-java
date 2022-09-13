package br.edu.uniaeso;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonHandler implements ItemListener {
    private Font font;

    public RadioButtonHandler(Font font){
        setFont(font);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Container container = ((JRadioButton) (e.getSource())).getParent();
        for (Component component : container.getComponents()) {
            if (component instanceof JTextField) {
                JTextField jField = (JTextField) component;
                jField.setFont(getFont());
                break;
            }
        }

    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

}
