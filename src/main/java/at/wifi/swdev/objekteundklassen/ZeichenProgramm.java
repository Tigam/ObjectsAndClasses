package at.wifi.swdev.objekteundklassen;

public class ZeichenProgramm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Form2D k1 = new Kreis();
        Form2D r1 = new Rechteck();
        Form2D d1 = new GleichseitigesDreieck();
        Form2D[] formen = {k1, r1, d1, k1};
        
        
//        for (int pos = 0; pos < formen.length; pos++) {
//            /*
//            Form2D konkreteImplementierungVonForm2d = formen[pos];
//            konkreteImplementierungVonForm2d.draw();
//            */
//            formen[pos].draw();
//        }
        
        for (int i = 0; i < formen.length; i++) {
            System.out.println("Element " + (i+1));
            Form2D form = formen[i];
            form.draw();
        }
        
        for (Form2D form : formen) {
            form.draw();
        }
        
        
        
        /*
        formen[0] = k1;
        formen[1] = r1;
        formen[2] = d1;
         */
/*
        int pos = 0;
        formen[pos++].draw();
        formen[pos++].draw();
        formen[pos++].draw();
        formen[pos++].draw();
*/
//        Kreis ka = new Kreis();
//        Kreis kb = new Kreis();
//
//        ka.setRadius(9700);
//        kb.setRadius(9700);
//        
//        kb.setX(12);
//        kb.setFarbe(Color.RED);
//        System.out.println(kb);
//        int a = 3;
//        int b = 3;
//
//
//        
//        if (ka.equals(null)) {
//            System.out.println("Gleich");
//        } else {
//            System.out.println("Ungleich");
//        }
//
//        Rechteck r1 = new Rechteck();
//
//       
//        r1.setA(2);
//        r1.setB(5);
//        r1.setX(100);
//        r1.setY(200);
//        r1.setFarbe(Color.GREEN);
//        System.out.println("Umfang: " + r1.berechneUmfang());
//        System.out.println("Fläche: " + r1.berechneFlaeche());
//        System.out.println(r1);
//        
//        Kreis testKreis = new Kreis();
//        Rechteck testRechteck = new Rechteck();
//        Form2D fKreis = (Form2D)testKreis;
//        Form2D fRechteck = (Form2D)testRechteck;
//
//        
//        fKreis.bewege(100, -5);
//        System.out.println(fKreis); // tostring von ?
//        System.out.println(fRechteck); // tostring von ?
//        GleichseitigesDreieck dreieck = new GleichseitigesDreieck();
//        dreieck.setA(3);
//        System.out.println(dreieck.berechneUmfang());
//        System.out.println(dreieck.berechneFlaeche());
//        Form2D form = new Form2D();
//        form.setFarbe(Color.WHITE);
//        Kreis demoKreis = new Kreis();
//        System.out.println(demoKreis.x);
//        for (int wiederholung = 0; wiederholung < 1000; wiederholung++) {
//            demoKreis.nachRechts();
//            System.out.println(demoKreis.x);
//        }
//
//        Kreis orangeKreis = new Kreis();
//
//        Kreis gruenerKreis = new Kreis();
//        Kreis blauerKreis = new Kreis();
//        Kreis alienKreis = new Kreis(9);
//        alienKreis.setRadius(-4.2);
//        System.out.println(alienKreis);
//
//        orangeKreis.setRadius(3.3);
//        gruenerKreis.setRadius(0.2);
//        blauerKreis.setRadius(6.8);
//
//        System.out.println("Kreis orange: " + orangeKreis.getRadius());
//        System.out.println("Kreis grün: " + gruenerKreis.getRadius());
//        System.out.println("Kreis blau: " + blauerKreis.getRadius());
//
//        System.out.println("Umfang Kreis orange: " + orangeKreis.berechneUmfang());
//        System.out.println("Umfang Kreis grün: " + gruenerKreis.berechneUmfang());
//        System.out.println("Umfang Kreis blau: " + blauerKreis.berechneUmfang());
//
//        System.out.println("Fläche Kreis orange: " + orangeKreis.berechneFlaeche());
//        System.out.println("Fläche Kreis grün: " + gruenerKreis.berechneFlaeche());
//        System.out.println("Fläche Kreis blau: " + blauerKreis.berechneFlaeche());
//
//        System.out.println(orangeKreis);
//        System.out.println(orangeKreis.toString());
//        System.out.println(gruenerKreis.toString());
//        System.out.println(blauerKreis.toString());
    }

}
