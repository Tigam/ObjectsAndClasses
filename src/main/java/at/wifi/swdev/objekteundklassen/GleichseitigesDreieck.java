package at.wifi.swdev.objekteundklassen;


public class GleichseitigesDreieck extends Form2D {
    
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double berechneUmfang() {
        return 3 * a;
    }

    @Override
    public double berechneFlaeche() {
        return Math.sqrt(3) / 4 * Math.pow(a, 2);
    }

    @Override
    public void draw() {
        System.out.println("<|");
    }
      
    
}
