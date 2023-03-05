package sk.stuba.fei.uim.oop;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


@Getter
@Setter
public class Logika extends UniverzalnyAdapter {

    private Platno platno;
    private Menu menu;
    private Integer xTmp;
    private Integer yTmp;

    public Logika() {
        this.platno = new Platno();
        this.menu = new Menu();
        this.menu.getTvary().addActionListener(this);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.xTmp = e.getX();
        this.yTmp = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if((this.xTmp != null) && (this.yTmp != null)){
            int xDlzka = Math.abs((xTmp - e.getX()));
            int yDlzka =  Math.abs((yTmp - e.getY()));
            int polomer = (int) Math.sqrt((Math.pow(xDlzka,2)+Math.pow(yDlzka,2)));
            if(polomer > this.menu.getSRozostup().getValue() + this.menu.getSRadius().getValue()){
                if(platno.getCiary().size() == this.menu.getSDlzka().getValue()) {
                    platno.getCiary().remove(0);
                    platno.getTvary().remove(0);
                }
                platno.getCiary().add(new Ciara(new Point(xTmp, yTmp), new Point(e.getX(), e.getY())));
                platno.getTvary().add(new Tvar(xTmp,yTmp,this.menu.getSRadius().getValue()));
                xTmp = e.getX();
                yTmp = e.getY();
                platno.repaint();
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if((this.xTmp != null) && (this.yTmp != null)){
            int xDlzka = Math.abs((xTmp - e.getX()));
            int yDlzka =  Math.abs((yTmp - e.getY()));
            int polomer = (int) Math.sqrt((Math.pow(xDlzka,2)+Math.pow(yDlzka,2)));
            if(polomer > this.menu.getSRozostup().getValue() + this.menu.getSRadius().getValue()){
                if(platno.getCiary().size() == this.menu.getSDlzka().getValue()) {
                    platno.getCiary().remove(0);
                    platno.getTvary().remove(0);
                }
                platno.getCiary().add(new Ciara(new Point(xTmp, yTmp), new Point(e.getX(), e.getY())));
                platno.getTvary().add(new Tvar(xTmp,yTmp,this.menu.getSRadius().getValue()));
                xTmp = e.getX();
                yTmp = e.getY();
                platno.repaint();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        platno.setNazov(this.menu.getPTvary()[((JComboBox<?>) e.getSource()).getSelectedIndex()]);
        platno.repaint();
    }
}
