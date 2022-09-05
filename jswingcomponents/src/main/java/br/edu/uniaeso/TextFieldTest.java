package br.edu.uniaeso;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldTest extends JFrame {
    private JTextField textField1, textField2, textField3;
    private JPasswordField passwordField;
    private TextFieldHandler handler;

    public TextFieldTest(){
        super("Text Field Test");
        setLayout(new FlowLayout());
        setHandler(new TextFieldHandler());

        configureTextField1();
        configureTextField2();
        configureTextField3();

        setSize(320, 100);
        setVisible(true);
    }

    private void configureTextField1(){
        setTextField1(new JTextField(10));
        getTextField1().addActionListener(getHandler());
        getTextField1().addMouseListener(getHandler());
        getContentPane().add(getTextField1());
    }

    private void configureTextField2(){
        setTextField2(new JTextField("Texto Padrão"));
        getTextField2().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Agora com o tipo interno ANONIMO!!");
            }
            
        });
        getContentPane().add(getTextField2());
    }

    private void configureTextField3(){
        setTextField3(new JTextField("Texto Não editável", 20));
        getTextField3().setEditable(false);
        getContentPane().add(getTextField3());
    }

    public JTextField getTextField1() {
        return textField1;
    }

    public void setTextField1(JTextField textField1) {
        this.textField1 = textField1;
    }

    public JTextField getTextField2() {
        return textField2;
    }

    public void setTextField2(JTextField textField2) {
        this.textField2 = textField2;
    }

    public JTextField getTextField3() {
        return textField3;
    }

    public void setTextField3(JTextField textField3) {
        this.textField3 = textField3;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public TextFieldHandler getHandler() {
        return handler;
    }

    public void setHandler(TextFieldHandler handler) {
        this.handler = handler;
    }
    
}
