package at.wifi.swdev.objekteundklassen;

/**
 * Formelsammlung für Kreis und Rechteckberechnungen.
 *
 * Demonstration für statische Funktionen / Methoden.
 *
 */
public class FormelSammlung {

    
    public static void calcWert(int zahl) {
        zahl = zahl + 5;
        System.out.println("calcWert : " + zahl);
    }
    
    public static  void aendereRadius(Kreis k) {
        k.setRadius(21);
    }
    
    /**
     * Berechnet die Kreisfläche aufgrund vom Radius.
     *
     * @param radius Der Radius des Kreises
     * @return Liefert die Fläche retour.
     */
    public static double flaecheKreis(double radius) {
        double area;
        area = radius * radius * Math.PI;
        return area;
    }

    /**
     * Berechnet den Kreisumfang aufgrund vom Radius.
     *
     * @param radius Der Radius des Kreises
     * @return Liefert den Umfang retour.
     */
    public static double umfangKreis(double radius) {
        return 2 * radius * Math.PI;
    }

    /**
     * Berechnet die Fläche eines Rechtecks aufgrund der Seiten a und b.
     *
     * @param a Die Seite a.
     * @param b Die Seite b.
     * @return Der Flächeninhalt wird retour geliefert.
     */
    public static double flaecheRechteck(double a, double b) {
        return a * b;
    }

    /**
     * Berechnet den Umfang eines Rechtecks aufgrund der Seiten a und b.
     *
     * @param a Die Seite a.
     * @param b Die Seite b.
     * @return Der Umfang wird retour geliefert.
     */
    public static double umfangRechteck(double a, double b) {
        return (a + b) * 2;
    }
}
