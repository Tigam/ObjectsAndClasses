package at.wifi.swdev.objekteundklassen;

public class AufzaehlungsTester {

  private static void display(LichtAuswahl eingabe) {
    switch (eingabe) {
      case LICHT_1:
        System.out.println("A");
        break;
      case LICHT_2:
        System.out.println("B");
        break;
      case LICHT_3:
        System.out.println("C");
        break;
    }
  }

  static enum LichtAuswahl {
    LICHT_1, LICHT_2, LICHT_3
  };

  public static void main(String[] args) {

    // Prüfe ob 1, 2 oder 3 ?
    display(LichtAuswahl.LICHT_1);
  }
}
