package at.wifi.swdev.objekteundklassen;

public class WochenTagTester {
  
  //enum WochenTag {MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG};
  
  public static void displayWochenTag(WochenTag wochentag) {
    
    if (wochentag == WochenTag.SONNTAG ||  wochentag == WochenTag.SAMSTAG) {
      System.out.println("Wochenende");
    }
    else {
      System.out.println("Wochentag");
    }
  }
  
  
  public static void main(String[] args) {
  
    // Erstellt eine statische Methode mit Übergabe einer einzelnen Aufzählung
    // MONTAG ... SONNTAG
    // Aufzählung enum
    WochenTag parsedWT = WochenTag.valueOf("SONNTAG");
    
    System.out.println("Von String: " + parsedWT);
    
    displayWochenTag(WochenTag.FREITAG);
    // Wochentag
    displayWochenTag(WochenTag.SAMSTAG);
    // Wochenende
    WochenTag[] werte = WochenTag.values();
    for (WochenTag wt : werte) {
      System.out.println("Kurzbezeichnung: " + wt.getKurzBezeichnung() + " Name: " + wt.name() + " Numerischer Wert: " + wt.ordinal());
    }
  }
  
}
