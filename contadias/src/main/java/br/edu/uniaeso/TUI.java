package br.edu.uniaeso;

import java.util.Scanner;

/**
 * Terminal User Interface
 */
public class TUI {
    private String txtNome;
    private int txtIdade;
    private Scanner scanner;
    Pessoa pessoa;
    CalculadorDias cd;
    private int totalDias;

    public TUI() {
        this.scanner = new Scanner(System.in);
        this.pessoa = new Pessoa();
        this.cd = new CalculadorDias();
        this.totalDias = 0;
    }

    public void printTUI() {
        System.out.println("Digite o nome da pessoa");
        this.txtNome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa:");
        this.txtIdade = scanner.nextInt();
    }

    public void solve() {
        pessoa.setNome(txtNome);
        pessoa.setIdade(txtIdade);
        totalDias = cd.totalDias(pessoa);
    }

    public void printResults() {
        System.out.println(pessoa.getNome() + ", você já viveu " + this.totalDias);
    }

    public void tui(){
        printTUI();
        solve();
        printResults();
    }
}
