package sk.stuba.fei.uim.oop;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

@Getter
@Setter
public class Platno extends JPanel {

    private ArrayList<Ciara> ciary;
    private ArrayList<Tvar> tvary;
    private String nazov;

    public Platno() {
        this.ciary = new ArrayList<>();
        this.tvary = new ArrayList<>();
        this.nazov = "Kruh";
        setFocusable(false);
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color povodnaF = g.getColor();
        int pocetT = tvary.size();
        ciary.forEach(l -> l.nakresliCiaru(g));
        for(int i = 0; i<pocetT; i++){
            g.setColor(Color.getHSBColor((float) i /pocetT,1,1));
            tvary.get(i).nakresliTvar(g,nazov);
        }
        g.setColor(povodnaF);
    }
}
