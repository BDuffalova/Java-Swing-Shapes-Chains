package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame {
    private Logika logika;

    public Okno() {
        super("Nazov okna");
        setLayout(new BorderLayout());
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.logika = new Logika();

        this.add(BorderLayout.CENTER, logika.getPlatno()); // Aby to fungovalo treba pridat Getter do classy Logika
        this.add(BorderLayout.LINE_START, logika.getMenu()); // Aby to fungovalo treba pridat Getter do classy Logika
        this.addMouseMotionListener(logika);
        this.addMouseListener(logika);
        setVisible(true);
    }
}
