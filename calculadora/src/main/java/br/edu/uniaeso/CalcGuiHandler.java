package br.edu.uniaeso;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalcGuiHandler implements ActionListener {

    private JTextField display;
    private Calculadora calculadora;

    public CalcGuiHandler(JTextField display) {
        setDisplay(display);
        setCalculadora(new Calculadora());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String displayText = getDisplay().getText();
        String buttonText = (((JButton) e.getSource()).getText());

        // Quando é número
        if ((buttonText == "0") || (buttonText == "1") || (buttonText == "2") || (buttonText == "3")
                || (buttonText == "4") || (buttonText == "5") || (buttonText == "6") || (buttonText == "7")
                || (buttonText == "8") || (buttonText == "9")) {

            getDisplay().setText(displayText + buttonText);
        } else if (buttonText == ".") {
            // Quando é ponto
            if (displayText.indexOf('.') == -1) {
                getDisplay().setText(displayText + buttonText);
            }
        } else if ((buttonText == "+") ||(buttonText == "-") || (buttonText == "*") || (buttonText == "/")){
            // Quando é operação:
            // Converter o texto do display pra double
            // Atribuir a primeira parcela pra Calculadora
            getCalculadora().setParcela1(Double.parseDouble(getDisplay().getText()));
            // Atribuir a operação pra Calculadora
            getCalculadora().setOperation(buttonText.toCharArray()[0]);
            // Limpar o display
            getDisplay().setText("0");
        } else if (buttonText == "=") {
            // Quando é o igual: 
            // Converter o texto no display pra double
            // Atribuir o valor pra parcela2 da calculadora
            getCalculadora().setParcela2(Double.parseDouble(getDisplay().getText()));
            // Chamar a função calculate da calculadora
            // Converter o resultado para string
            // Atribuir o resultado pro display
            getDisplay().setText(Double.toString((getCalculadora().calculate())));
        }

    }

    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    
}
