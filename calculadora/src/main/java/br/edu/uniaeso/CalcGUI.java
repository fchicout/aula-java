package br.edu.uniaeso;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcGUI extends JFrame {
    private JTextField display;
    private JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, opSum, opSub, opMult, opDiv, opDot,
            result;

    private CalcGuiHandler handler;

    public CalcGUI() {
        super("Calculadora");

        setLayout(new FlowLayout());

        configureDisplay();
        setHandler(new CalcGuiHandler(getDisplay()));
        configureNum7();
        configureNum8();
        configureNum9();
        configureOpDiv();
        configureNum4();
        configureNum5();
        configureNum6();
        configureOpMult();
        configureNum1();
        configureNum2();
        configureNum3();
        configureOpSub();
        configureNum0();
        configureDot();
        configureResult();
        configureOpSum();

        setSize(150, 250);
        setVisible(true);

    }

    private void configureOpSum() {
        setOpSum(new JButton("+"));
        getOpSum().addActionListener(getHandler());
        getContentPane().add(getOpSum());
    }

    private void configureResult() {
        setResult(new JButton("="));
        getResult().addActionListener(getHandler());
        getContentPane().add(getResult());
    }

    private void configureDot() {
        setOpDot(new JButton("."));
        getOpDot().addActionListener(getHandler());
        getContentPane().add(getOpDot());
    }

    private void configureNum0() {
        setNum0(new JButton("0"));
        getNum0().addActionListener(getHandler());
        getContentPane().add(getNum0());
    }

    private void configureOpSub() {
        setOpSub(new JButton("-"));
        getOpSub().addActionListener(getHandler());
        getContentPane().add(getOpSub());
    }

    private void configureNum3() {
        setNum3(new JButton("3"));
        getNum3().addActionListener(getHandler());
        getContentPane().add(getNum3());
    }

    private void configureNum2() {
        setNum2(new JButton("2"));
        getNum2().addActionListener(getHandler());
        getContentPane().add(getNum2());
    }

    private void configureNum1() {
        setNum1(new JButton("1"));
        getNum1().addActionListener(getHandler());
        getContentPane().add(getNum1());
    }

    private void configureOpMult() {
        setOpMult(new JButton("*"));
        getOpMult().addActionListener(getHandler());
        getContentPane().add(getOpMult());
    }

    private void configureNum6() {
        setNum6(new JButton("6"));
        getNum6().addActionListener(getHandler());
        getContentPane().add(getNum6());
    }

    private void configureNum5() {
        setNum5(new JButton("5"));
        getNum5().addActionListener(getHandler());
        getContentPane().add(getNum5());
    }

    private void configureNum4() {
        setNum4(new JButton("4"));
        getNum4().addActionListener(getHandler());
        getContentPane().add(getNum4());
    }

    private void configureOpDiv() {
        setOpDiv(new JButton("/"));
        getOpDiv().addActionListener(getHandler());
        getContentPane().add(getOpDiv());
    }

    private void configureNum9() {
        setNum9(new JButton("9"));
        getNum9().addActionListener(getHandler());
        getContentPane().add(getNum9());
    }

    private void configureNum8() {
        setNum8(new JButton("8"));
        getNum8().addActionListener(getHandler());
        getContentPane().add(getNum8());
    }

    private void configureNum7() {
        setNum7(new JButton("7"));
        getNum7().addActionListener(getHandler());
        getContentPane().add(getNum7());
    }

    private void configureDisplay() {
        setDisplay(new JTextField("0"));
        getDisplay().setColumns(18);
        getDisplay().setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(getDisplay());
    }

    public JButton getNum1() {
        return num1;
    }

    public void setNum1(JButton num1) {
        this.num1 = num1;
    }

    public JButton getNum2() {
        return num2;
    }

    public void setNum2(JButton num2) {
        this.num2 = num2;
    }

    public JButton getNum3() {
        return num3;
    }

    public void setNum3(JButton num3) {
        this.num3 = num3;
    }

    public JButton getNum4() {
        return num4;
    }

    public void setNum4(JButton num4) {
        this.num4 = num4;
    }

    public JButton getNum5() {
        return num5;
    }

    public void setNum5(JButton num5) {
        this.num5 = num5;
    }

    public JButton getNum6() {
        return num6;
    }

    public void setNum6(JButton num6) {
        this.num6 = num6;
    }

    public JButton getNum7() {
        return num7;
    }

    public void setNum7(JButton num7) {
        this.num7 = num7;
    }

    public JButton getNum8() {
        return num8;
    }

    public void setNum8(JButton num8) {
        this.num8 = num8;
    }

    public JButton getNum9() {
        return num9;
    }

    public void setNum9(JButton num9) {
        this.num9 = num9;
    }

    public JButton getNum0() {
        return num0;
    }

    public void setNum0(JButton num0) {
        this.num0 = num0;
    }

    public JButton getOpSum() {
        return opSum;
    }

    public void setOpSum(JButton opSum) {
        this.opSum = opSum;
    }

    public JButton getOpSub() {
        return opSub;
    }

    public void setOpSub(JButton opSub) {
        this.opSub = opSub;
    }

    public JButton getOpMult() {
        return opMult;
    }

    public void setOpMult(JButton opMult) {
        this.opMult = opMult;
    }

    public JButton getOpDiv() {
        return opDiv;
    }

    public void setOpDiv(JButton opDiv) {
        this.opDiv = opDiv;
    }

    public JButton getOpDot() {
        return opDot;
    }

    public void setOpDot(JButton opDot) {
        this.opDot = opDot;
    }

    public JTextField getDisplay() {
        return display;
    }

    public void setDisplay(JTextField display) {
        this.display = display;
    }

    public JButton getResult() {
        return result;
    }

    public void setResult(JButton result) {
        this.result = result;
    }

    public CalcGuiHandler getHandler() {
        return handler;
    }

    public void setHandler(CalcGuiHandler handler) {
        this.handler = handler;
    }

}
