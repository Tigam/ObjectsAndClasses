package at.wifi.swdev.objekteundklassen;

public enum WochenTag {
  MONTAG("Mo."), DIENSTAG("Di."), MITTWOCH("Mi."), DONNERSTAG("Do."), 
  FREITAG("Fr."), SAMSTAG("Sa."), SONNTAG("So."), FEIERTAG("Frei");

  
  private String kurzBezeichnung;
  
  private WochenTag(String kurzBezeichung) {
    this.kurzBezeichnung = kurzBezeichung;
  }

  public String getKurzBezeichnung() {
    return kurzBezeichnung;
  }
  
  
  
}
