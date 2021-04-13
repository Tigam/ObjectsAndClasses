package at.wifi.swdev.objekteundklassen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputTester {

  public static String readTextFile() throws DateiException {
    String text = "";
    try (BufferedReader br = new BufferedReader(new FileReader("/tmp/testx.txt"))) {
      text = br.readLine(); // Fehler !!!!!!!!!!!!!!!!!!!!!

      System.out.println("Datei gelesen.");
    } catch (IOException ioe) {
      System.err.println("(readTextFile) Fehler beim Lesen der Datei! " + ioe.getMessage());
      //IOException meineException = new IOException("Text Datei konnte nicht gelesen werden!");
      //throw meineException;
      throw new DateiException("Text Datei konnte nicht gelesen werden!");
    }
//    finally {
//      if (br != null) {
//        try {
//          br.close();
//        } catch (IOException ignore) {
//          // Beim Schließen der Datei ist der Fehler egal.
//        }
//      }
//    }

    return text;
  }

  public static void main(String[] args) {
    String ergebnis;

    try {
      ergebnis = readTextFile();
      System.out.println("Inhalt der Datei: " + ergebnis);

      // hier wird weitergearbeitet
    } catch (DateiException ioe) {
      System.err.println("MAIN: " + ioe.getMessage());
    }

//    String eingabe = "x12";
//
//    int eingabeZahl = 0;
//    try {
//      eingabeZahl = Integer.parseInt(eingabe);
//
//    } catch (NumberFormatException nfe) {
//      System.err.println("Fehler beim Konvertieren eines Strings in eine integer Zahl: " + nfe.getMessage());
//    } finally {
//      System.out.println("Wird immer ausgeführt");
//    }
//
//    int summe = eingabeZahl + 42;
//
//    System.out.println("Ergebnis " + summe);
//
  }

}
