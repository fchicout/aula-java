package br.edu.uniaeso;

public class Calculadora {
    private double parcela1;
    private double parcela2;

    private char operation;

    public Calculadora() {
    }

    public Calculadora(double p1, char operation, double p2) {
        setParcela1(p1);
        setOperation(operation);
        setParcela2(p2);
    }

    public double calculate() {
        double result = 0.0;
        switch (getOperation()) {
            case '+':
                result = getParcela1() + getParcela2();
                break;
            case '-':
                result = getParcela1() - getParcela2();
                break;
            case '*':
                result = getParcela1() * getParcela2();
                break;
            case '/':
                result = getParcela1() / getParcela2();
                break;
        }
        return result;
    }

    public double getParcela1() {
        return parcela1;
    }

    public void setParcela1(double parcela1) {
        this.parcela1 = parcela1;
    }

    public double getParcela2() {
        return parcela2;
    }

    public void setParcela2(double parcela2) {
        this.parcela2 = parcela2;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

}
