package conditions.loop.whilex;

public class Main {
  public static int x = 0;
  public static int y = 5;

  public static void whileLoop() {
    while (x++ < y) {
      System.out.println(x);
    }
    // while (x++ < y)
    //   System.out.println(x);
    // while (x++ < y) System.out.println(x);
  }

  public static void infiniteLoop() {
    while (true) {
      System.out.println(x++);
      if (x >= y) break;
    }
  }

  public static void main(String[] args) {
    whileLoop();
    infiniteLoop();
  }
}
