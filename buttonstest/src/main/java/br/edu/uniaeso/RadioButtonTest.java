package br.edu.uniaeso;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonTest extends JFrame {
    private JTextField demoText;
    private JRadioButton jrbPlain, jrbBold, jrbItalic, jrbBoldItalic;
    private Font fPlainSerif, fBoldSerif, fItalicSerif, fBoldItalicSerif;
    private ButtonGroup jrbFontGroup;

    public RadioButtonTest() {
        super("Teste de Radio Buttons");
        
        configurePlainFont();
        configureBoldFont();
        configureItalicFont();
        configureBoldItalicFont();

        configurePlainRadio();
        configureBoldRadio();
        configureItalicRadion();
        configureBoldItalicRadio();
        
        configureButtonGroup();
        

        configureDemoText();

        this.setLayout(new FlowLayout());
        this.setSize(300, 100);
        this.setVisible(true);
    }

    private void configureBoldItalicFont() {
        setfBoldItalicSerif(new Font("Serif", Font.ITALIC+Font.BOLD, 14));
    }

    private void configureItalicFont() {
        setfItalicSerif(new Font("Serif", Font.ITALIC, 14));
    }

    private void configureBoldFont() {
        setfBoldSerif(new Font("Serif", Font.BOLD, 14));
    }

    private void configurePlainFont() {
        setfPlainSerif(new Font("Serif", Font.PLAIN, 14));
    }

    private void configureButtonGroup() {
        setJrbFontGroup(new ButtonGroup());
        getJrbFontGroup().add(getJrbPlain());
        getJrbFontGroup().add(getJrbBold());
        getJrbFontGroup().add(getJrbItalic());
        getJrbFontGroup().add(getJrbBoldItalic());
    }

    private void configureBoldItalicRadio() {
        setJrbBoldItalic(new JRadioButton());
        getJrbBoldItalic().setText("Bold/Italic");
        getJrbBoldItalic().setSelected(false);

        getJrbBoldItalic().addItemListener(new RadioButtonHandler(getfBoldItalicSerif()));

        getContentPane().add(getJrbBoldItalic());
    }

    private void configureItalicRadion() {
        setJrbItalic(new JRadioButton());
        getJrbItalic().setText("Italic");
        getJrbItalic().setSelected(false);

        getJrbItalic().addItemListener(new RadioButtonHandler(getfItalicSerif()));

        getContentPane().add(getJrbItalic());
    }

    private void configureBoldRadio() {
        setJrbBold(new JRadioButton());
        getJrbBold().setText("Bold");
        getJrbBold().setSelected(false);

        getJrbBold().addItemListener(new RadioButtonHandler(getfBoldSerif()));

        getContentPane().add(getJrbBold());
    }

    private void configurePlainRadio() {
        setJrbPlain(new JRadioButton());
        getJrbPlain().setText("Plain");
        getJrbPlain().setSelected(true);

        getJrbPlain().addItemListener(new RadioButtonHandler(getfPlainSerif()));

        getContentPane().add(getJrbPlain());
    }

    private void configureDemoText() {
        setDemoText(new JTextField());
        getDemoText().setText("Watch the font style change");
        getDemoText().setColumns(25);

        // this.demoText = new JTextField();
        // this.demoText.setColumns(25);
        // this.demoText.setText("Watch the font style change");

        getDemoText().setFont(getfPlainSerif());

        getContentPane().add(getDemoText());
    }

    public JTextField getDemoText() {
        return demoText;
    }

    public void setDemoText(JTextField demoText) {
        this.demoText = demoText;
    }

    public JRadioButton getJrbPlain() {
        return jrbPlain;
    }

    public void setJrbPlain(JRadioButton jrbPlain) {
        this.jrbPlain = jrbPlain;
    }

    public JRadioButton getJrbBold() {
        return jrbBold;
    }

    public void setJrbBold(JRadioButton jrbBold) {
        this.jrbBold = jrbBold;
    }

    public JRadioButton getJrbItalic() {
        return jrbItalic;
    }

    public void setJrbItalic(JRadioButton jrbItalic) {
        this.jrbItalic = jrbItalic;
    }

    public JRadioButton getJrbBoldItalic() {
        return jrbBoldItalic;
    }

    public void setJrbBoldItalic(JRadioButton jrbBoldItalic) {
        this.jrbBoldItalic = jrbBoldItalic;
    }

    public ButtonGroup getJrbFontGroup() {
        return jrbFontGroup;
    }

    public void setJrbFontGroup(ButtonGroup jrbFontGroup) {
        this.jrbFontGroup = jrbFontGroup;
    }

    public Font getfPlainSerif() {
        return fPlainSerif;
    }

    public void setfPlainSerif(Font fPlainSerif) {
        this.fPlainSerif = fPlainSerif;
    }

    public Font getfBoldSerif() {
        return fBoldSerif;
    }

    public void setfBoldSerif(Font fBoldSerif) {
        this.fBoldSerif = fBoldSerif;
    }

    public Font getfItalicSerif() {
        return fItalicSerif;
    }

    public void setfItalicSerif(Font fItalicSerif) {
        this.fItalicSerif = fItalicSerif;
    }

    public Font getfBoldItalicSerif() {
        return fBoldItalicSerif;
    }

    public void setfBoldItalicSerif(Font fBoldItalicSerif) {
        this.fBoldItalicSerif = fBoldItalicSerif;
    }

}
