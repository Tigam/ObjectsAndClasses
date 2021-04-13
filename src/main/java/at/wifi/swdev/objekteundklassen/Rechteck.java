
package at.wifi.swdev.objekteundklassen;

public class Rechteck extends Form2D /*implements Drawable*/ {
    private double a;
    private double b;

    public Rechteck() {
    }

    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rechteck{" + "a=" + a + ", b=" + b + ", x=" + getX()+", y=" + getY()+", farbe=" + getFarbe()+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.b) ^ (Double.doubleToLongBits(this.b) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rechteck other = (Rechteck) obj;
        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(other.a)) {
            return false;
        }
        if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(other.b)) {
            return false;
        }
        return true;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    /**
     * Berechnet den Umfang des Rechtecks.
     *
     * @return Der Umfang wird retour geliefert.
     */
    @Override
    public double berechneUmfang() {
        return 2 * (this.a + this.b);
    }

    /**
     * Berechnet die Fläche des Rechtecks.
     *
     * @return Die Fläche wird retour geliefert.
     */
    public double berechneFlaeche() {
        return this.a * this.b;
    }

    @Override
    public void draw() {
        System.out.println("|=|");
    }
}
