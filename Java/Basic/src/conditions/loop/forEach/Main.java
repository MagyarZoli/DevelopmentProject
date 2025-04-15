package conditions.loop.forEach;

public class Main {
  public static String[] x = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

  public static void forEachLoop() {
    for (String i : x) {
      System.out.println(i);
    }
    // for (var i : x)
    //   System.out.println(i);
    // for (var i : x) System.out.println(i);
  }

  public static void main(String[] args) {
    forEachLoop();
  }
}
