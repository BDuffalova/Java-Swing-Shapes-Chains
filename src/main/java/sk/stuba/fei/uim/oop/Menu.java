package sk.stuba.fei.uim.oop;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class Menu extends JPanel {

    private String[] pTvary = {"Kruh","Štvorec","Hodiny"};
    private JLabel dlzka;
    private JLabel radius;
    private JLabel rozostup;
    private JSlider sDlzka;
    private JSlider sRadius;
    private JSlider sRozostup;
    private JComboBox tvary;
    public Menu() {
        this.setFocusable(false);
        this.setLayout(new GridLayout(3,1)); // Vlozit taky layout aky sa bude hodit
        JPanel nazvy = new JPanel();
        nazvy.setFocusable(false);
        nazvy.setLayout(new GridLayout(1,3));
        dlzka = new JLabel("Dlzka");
        radius = new JLabel("Radius");
        rozostup = new JLabel("Rozostup");
        nazvy.add(dlzka);
        nazvy.add(radius);
        nazvy.add(rozostup);

        nazvy.setBackground(Color.GREEN);

        this.add(nazvy);
        JPanel slidre = new JPanel();
        slidre.setFocusable(false);
        slidre.setBackground(Color.GREEN);
        nazvy.setLayout(new GridLayout(1,3));

        sDlzka = new JSlider(JSlider.VERTICAL,20,200,50);
        sDlzka.setFocusable(false);
        sDlzka.setMajorTickSpacing(10);
        sDlzka.setPaintLabels(true);
        sDlzka.setPaintTicks(true);
        sDlzka.setSnapToTicks(true);

        sRadius = new JSlider(JSlider.VERTICAL,1,20,5);
        sRadius.setFocusable(false);
        sRadius.setMajorTickSpacing(1);
        sRadius.setPaintLabels(true);
        sRadius.setPaintTicks(true);
        sRadius.setSnapToTicks(true);

        sRozostup = new JSlider(JSlider.VERTICAL,1,20,5);
        sRozostup.setFocusable(false);
        sRozostup.setMajorTickSpacing(1);
        sRozostup.setPaintLabels(true);
        sRozostup.setPaintTicks(true);
        sRozostup.setSnapToTicks(true);

        slidre.add(sDlzka);
        slidre.add(sRadius);
        slidre.add(sRozostup);
        this.add(slidre);

        tvary = new JComboBox(pTvary);
        tvary.setFocusable(false);
        tvary.setSelectedIndex(0);
        tvary.setBackground(Color.GREEN);
        this.add(tvary);
    }
}
