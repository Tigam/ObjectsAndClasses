package at.wifi.swdev.objekteundklassen.interfacedemo;

public class LambdaTester {

  public static void main(String[] args) {

    System.out.println("A");

    ActionHandler handler = new ActionHandler() {
      @Override
      public void action(String msg) {
        System.out.println("v1");
        System.out.println("Handler Impl. " + msg);
      }
    };
    System.out.println("B");

    ActionHandler handler2 = (String msg) -> {
      System.out.println("v2");
      System.out.println("Handler Impl. " + msg);
    };
    System.out.println("C");

    ActionHandler handler3 = (msg) -> {
      System.out.println("v3");
      System.out.println("Handler Impl. " + msg);
    };

    System.out.println("D");

    handler3.action("hallo");

    System.out.println("E");

  }

}
