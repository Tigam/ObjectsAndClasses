package at.wifi.swdev.objekteundklassen;

import java.util.Objects;

public class Kreis extends Form2D {

    private double radius = 0;

    public Kreis() {

    }

    public Kreis(double radius) {
        this.radius = radius;
    }

    /**
     * Berechnet den Umfang des Kreises.
     *
     * @return Der Umfang wird retour geliefert.
     */
    public double berechneUmfang() {
        return 2 * radius * Math.PI;
    }

    /**
     * Berechnet die Fläche des Kreises.
     *
     * @return Die Fläche wird retour geliefert.
     */
    public double berechneFlaeche() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        String toStringForm2D = super.toString();

        return "Kreis mit Radius=" + radius + " und Fläche " + berechneFlaeche() + " " + toStringForm2D;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.abs(radius);
    }

    public int x; // = 0

    public void nachRechts() {
        x++;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.radius) ^ (Double.doubleToLongBits(this.radius) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Objects.isNull(obj)) {
            //if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kreis other = (Kreis) obj;
        if (Double.doubleToLongBits(this.radius) != Double.doubleToLongBits(other.radius)) {
            return false;
        }
        return true;
    }

    @Override
    public void draw() {
        System.out.println("O");
    }

}
