package conditions.loop.dox;

public class Main {
  public static int x = 0;
  public static int y = 5;

  public static void doLoop() {
    do {
      System.out.println(x);
    } while (x++ < y);
    // do
    //   System.out.println(x);
    // while (x++ < y);
    // do System.out.println(x); while (x++ < y);
  }

  public static void infiniteLoop() {
    do {
      System.out.println(x++);
      if (x >= y) break;
    } while (true);
  }

  public static void main(String[] args) {
    doLoop();
    infiniteLoop();
  }
}
