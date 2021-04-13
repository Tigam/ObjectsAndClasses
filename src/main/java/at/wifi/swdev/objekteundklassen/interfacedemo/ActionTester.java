package at.wifi.swdev.objekteundklassen.interfacedemo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ActionTester {

  private static int counter = 0;

  private static void macheEtwas(ActionHandler handler) {
    counter++;
    handler.action("Erster Ausgabe.");
  }

  public static void main(String[] args) {
    // Variante mit externer Implementierung eines Interfaces
    ActionHandler actionHandler = new MeinActionHandler();

    macheEtwas(actionHandler);

    // Variante mit anonymer Implementierung eines Interfaces
    ActionHandler anoHandler = new ActionHandler() {

      @Override
      public void action(String msg) {
        counter++;
        System.out.println("Meine interne Implementierung von ActionHandler: " + msg);
      }
    };

    macheEtwas(anoHandler);
    //System.out.println("Counter " + counter);
    
    
    // Variante direkte Implementierung eines Interfaces
    macheEtwas(new ActionHandler() {
      @Override
      public void action(String msg) {
        System.out.println("Meine direkte Implementierung von ActionHandler: " + msg);
      }
    });
    
    MouseListener mouseListener = new IntMeinMouseAdapter();
    
    
    MouseListener mouseListenerDirekt = new MeinMouseWindowAdapter() {
      @Override
      public void mouseClicked(MouseEvent me) {
        System.out.println("MA direkt");
      }
      
    };
  }
  
  static class IntMeinMouseAdapter extends MeinMouseWindowAdapter {

    @Override
    public void mouseClicked(MouseEvent me) {
      System.out.println("MA über Klasse");
    }
    
  }
}
