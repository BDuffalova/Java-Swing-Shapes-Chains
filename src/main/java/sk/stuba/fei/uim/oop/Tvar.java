package sk.stuba.fei.uim.oop;

import java.awt.*;

public class Tvar {

    private int x;
    private int y;
    private int polomer;

    public Tvar(int x, int y, int polomer) {
        this.x = x;
        this.y = y;
        this.polomer = polomer;
    }
    public void nakresliTvar(Graphics g, String nazov){
        if(nazov == "Kruh"){
            g.fillOval(this.x - this.polomer,this.y - this.polomer, 2*this.polomer, 2*this.polomer);
        }
        if(nazov == "Štvorec"){
            g.fillRect(this.x - this.polomer,this.y - this.polomer, 2*this.polomer, 2*this.polomer);
        }
        if(nazov == "Hodiny"){
            int[] x1 = {this.x - this.polomer, this.x + this.polomer, this.x};
            int[] y1 = {this.y - this.polomer,this.y - this.polomer,this.y};
            g.fillPolygon(x1,y1,3);
            int[] x2 = {this.x - this.polomer, this.x + this.polomer, this.x};
            int[] y2 = {this.y + this.polomer,this.y + this.polomer,this.y};
            g.fillPolygon(x2,y2,3);

        }
    }
}
