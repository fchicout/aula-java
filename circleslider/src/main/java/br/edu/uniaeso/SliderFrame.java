package br.edu.uniaeso;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {
    private JSlider diameterSlider;
    private OvalPanel ovalPanel;

    public SliderFrame() {
        super("Slider demo");

        configureOvalPanel();

        configureDiameterSlider();
        getContentPane().setLayout(new FlowLayout());

        setSize(220,270);
        setVisible(true);
    }

    private void configureDiameterSlider() {
        setDiameterSlider(new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10));
        getDiameterSlider().setMajorTickSpacing(10);
        getDiameterSlider().setPaintTicks(true);
        getDiameterSlider().addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                getOvalPanel().setDiameter(getDiameterSlider().getValue());
            }

        });
        getContentPane().add(getDiameterSlider());
    }

    private void configureOvalPanel() {
        setOvalPanel(new OvalPanel());
        getOvalPanel().setBackground(Color.YELLOW);
        getContentPane().add(getOvalPanel());
    }

    public JSlider getDiameterSlider() {
        return diameterSlider;
    }

    public void setDiameterSlider(JSlider diameterSlider) {
        this.diameterSlider = diameterSlider;
    }

    public OvalPanel getOvalPanel() {
        return ovalPanel;
    }

    public void setOvalPanel(OvalPanel ovalPanel) {
        this.ovalPanel = ovalPanel;
    }

}
