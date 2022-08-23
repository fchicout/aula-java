package br.edu.uniaeso;

import java.util.Scanner;

public class TUI {
    private double txtXCoord;
    private double txtYCoord;
    private Scanner scanner;
    private Ponto2D p1, p2;
    private double distanciaEntrePontos;

    public TUI() {
        setScanner(new Scanner(System.in));

    }

    private void printTUI() {
        System.out.println("Entre com a coordenada x do P1");
        setTxtXCoord(scanner.nextDouble());
        System.out.println("Entre com a coordenada y do P1");
        setTxtYCoord(scanner.nextDouble());
        setP1(new Ponto2D(getTxtXCoord(), getTxtYCoord()));

        System.out.println("Entre com a coordenada x do P2");
        setTxtXCoord(scanner.nextDouble());
        System.out.println("Entre com a coordenada y do P2");
        setTxtYCoord(scanner.nextDouble());
        setP2(new Ponto2D(getTxtXCoord(), getTxtYCoord()));
    }

    private void solve() {
        setDistanciaEntrePontos(GeometryUtils.distanciaEntrePontos(getP1(), getP2()));
    }

    private void printResult() {
        System.out.println("Considerando o ponto p1 " + p1);
        System.out.println(" e o ponto p2 " + p2);
        System.out.println("A distância entre eles é: " + getDistanciaEntrePontos());
    }

    public void tui(){
        printTUI();
        solve();
        printResult();
    }

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
    }

    public Ponto2D getP2() {
        return p2;
    }

    public void setP2(Ponto2D p2) {
        this.p2 = p2;
    }

    public double getTxtXCoord() {
        return txtXCoord;
    }

    public void setTxtXCoord(double txtXCoord) {
        this.txtXCoord = txtXCoord;
    }

    public double getTxtYCoord() {
        return txtYCoord;
    }

    public void setTxtYCoord(double txtYCoord) {
        this.txtYCoord = txtYCoord;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getDistanciaEntrePontos() {
        return distanciaEntrePontos;
    }

    public void setDistanciaEntrePontos(double distanciaEntrePontos) {
        this.distanciaEntrePontos = distanciaEntrePontos;
    }

}
