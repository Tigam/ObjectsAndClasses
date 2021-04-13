package at.wifi.swdev.objekteundklassen;

import java.util.ArrayList;

public class ZeichenProgrammCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ZeichenProgrammCollection.main");

        ArrayList<Drawable> formen = new ArrayList<>();

        Kreis k1 = new Kreis();
        Rechteck r1 = new Rechteck();

        formen.add(k1);
        formen.add(r1);
        //formen.add("Hallo");
        formen.add(new GleichseitigesDreieck());
        formen.add(k1);

        
        for (Drawable d : formen) {
            d.draw();
        }
        
//        
//        for (int pos = 0; pos < formen.size(); pos++) {
//            Drawable d = formen.get(pos);
//            d.draw();
//        }
        
        

    }

}
