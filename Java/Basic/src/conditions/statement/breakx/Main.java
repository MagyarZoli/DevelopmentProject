package conditions.statement.breakx;

public class Main {
  public static int x = 0;
  public static int y = 5;

  public static void breakStatement() {
    while (true) {
      if (x == y) {
        break;
      }
      System.out.println(++x);
    }
  }

  public static void main(String[] args) {
    breakStatement();
  }
}
