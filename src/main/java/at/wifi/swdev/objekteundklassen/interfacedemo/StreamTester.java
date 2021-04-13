package at.wifi.swdev.objekteundklassen.interfacedemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTester {

  public static void main(String[] args) {
    List<String> liste = new ArrayList<>();

    liste.add("A");
    liste.add("B");
    liste.add("C");
    liste.add("D");

//    for (String element : liste) {
//      System.out.println(element);
//    }
    //Old school
//    Consumer<String> anzeiger = new Consumer<String>() {
//      @Override
//      public void accept(String t) {
//        System.out.println(t);
//      }
//    };
// Vneu
    Consumer<String> anzeigerNeu = (String t) -> {
      System.out.println(t);
    };

// Vneuer
    Consumer<String> anzeigerNeuer = (t) -> {
      System.out.println(t);
    };

    // Vneuer
    Consumer<String> anzeigerNeuer2 = t -> {
      System.out.println(t);
    };
    // Vneuer
    Consumer<String> anzeigerNeuer3 = t -> System.out.println(t);

    Predicate<String> meinFilter = e -> {
      System.out.println("Filter aktiv mit Element " + e);
      return e.startsWith("A");
    };

    //liste.forEach(anzeigerNeuer2);
    liste.forEach(element -> System.out.println(element));

    liste.forEach(System.out::println);

//    Stream.of("A", "B", "A", "C", "B", "C")
//            .filter(meinFilter)
//            .limit(4)
//            .map(e -> {return e.toLowerCase();})
//            .forEach(anzeigerNeuer3);
    
     Stream.of("A", "B", "A", "C", "B", "C")
             .parallel()
            .filter(f -> f.startsWith("A"))
            .limit(4)
            .map(e -> e.toLowerCase())
            .forEach(System.out::println);

  }

}
