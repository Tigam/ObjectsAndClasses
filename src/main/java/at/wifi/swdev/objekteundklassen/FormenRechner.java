
package at.wifi.swdev.objekteundklassen;


public class FormenRechner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double r = 3.0;
        double kreisFlaeche;
        
        
        
        kreisFlaeche = FormelSammlung.flaecheKreis(r);
        double kreisUmfang = FormelSammlung.umfangKreis(r);
        System.out.printf("Kreisfläche: %.2f%n", kreisFlaeche);
        System.out.printf("Kreisumfang: %.2f%n", kreisUmfang);
        
        double laenge = 12;
        double breite = 10;
        double umfangRechteck = FormelSammlung.umfangRechteck(laenge, breite);
        double flaecheRechteck = FormelSammlung.flaecheRechteck(laenge, breite);
        System.out.printf("Rechteck Fläche: %.2f%n", flaecheRechteck);
        System.out.printf("Rechteck Umfang: %.2f%n", umfangRechteck);
        
        
        int hugo = 5;
        System.out.println("main1 " + hugo);
        FormelSammlung.calcWert(hugo);
        System.out.println("main2 " + hugo);
        
        Kreis kreis = new Kreis(1234);
        System.out.println("main1 " + kreis);
        FormelSammlung.aendereRadius(kreis);
        System.out.println("main2 " + kreis);
        
    }
    
}
