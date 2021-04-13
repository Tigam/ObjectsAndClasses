package at.wifi.swdev.objekteundklassen.interfacedemo;

public class MeinActionHandler implements ActionHandler {

  @Override
  public void action(String msg) {
    //counter
    System.out.println("Meine Implementierung von ActionHandler: " + msg);
  }
  
  
}
