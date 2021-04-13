package at.wifi.swdev.objekteundklassen;

import java.io.IOException;

public class DateiException extends IOException {

  public DateiException() {
    super();
  }

  public DateiException(String msg) {
    super("Dateifehler: " + msg);
  }

}
