package conditions.statement.continuex;

public class Main {
  public static int x = 0;
  public static int y = 5;
  public static int z = 2;

  public static void continueStatement() {
    while (x < y) {
      x++;
      if (x == z) {
        continue;
      }
      System.out.println(x);
    }
  }

  public static void main(String[] args) {
    continueStatement();
  }
}
