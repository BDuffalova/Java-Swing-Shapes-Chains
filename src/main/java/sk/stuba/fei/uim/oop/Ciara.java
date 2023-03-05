package sk.stuba.fei.uim.oop;

import java.awt.*;

public class Ciara {
    private Point start;
    private Point koniec;

    public Ciara(Point start, Point koniec) {
        this.start = start;
        this.koniec = koniec;
    }

    public void nakresliCiaru(Graphics g){
        g.drawLine(start.x,start.y,koniec.x,koniec.y);
    }
}
