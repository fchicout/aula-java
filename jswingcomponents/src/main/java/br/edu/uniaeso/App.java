package br.edu.uniaeso;

import javax.swing.JFrame;

public class App
// - Quebrar o paradigma imperativo natural da máquina -> OO
// - Reconfigurar/Repassar adequadamente para a interface tudo que o SO enviar 
{
    public static void main( String[] args )
    {
        TextFieldTest tft = new TextFieldTest();
        tft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
