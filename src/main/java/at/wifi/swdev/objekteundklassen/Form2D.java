package at.wifi.swdev.objekteundklassen;

import java.awt.Color;

public abstract class Form2D extends Object implements Drawable{

    private int x;
    private int y;
    private Color farbe;

    public Form2D() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getFarbe() {
        return farbe;
    }

    public void setFarbe(Color farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Form2D{" + "x=" + x + ", y=" + y + ", farbe=" + farbe + '}';
    }

    /**
     * Bewegt die Form mit Delta X und Y.
     *
     * @param xDelta Unterschied in der horizontalen Ebene
     * @param yDelta Unterschied in der vertikalen Ebene
     */
    public void bewege(int xDelta, int yDelta) {
        //x += xDelta;
        //y += yDelta;

        this.setX(this.getX() + xDelta);
        setY((getY() + yDelta));
    }

    public abstract double berechneUmfang();

    public abstract double berechneFlaeche();
}
