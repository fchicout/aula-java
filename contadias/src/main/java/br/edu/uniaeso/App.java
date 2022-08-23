package br.edu.uniaeso;

/**
 * Escreva um programa em java para ler o nome e a idade de uma pessoa, 
 * e exibir quantos dias de vida ela possui. Considere sempre anos 
 * completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos
 * possui 6935 dias de vida; veja um exemplo de saída: 
 * MARIA, VOCÊ JÁ VIVEU 6935 DIAS
 */
public class App 
{
    public static void main( String[] args )
    {
        TUI t = new TUI();
        t.tui();
    }
}
