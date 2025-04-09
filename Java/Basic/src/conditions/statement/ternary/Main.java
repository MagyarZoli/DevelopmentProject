package conditions.statement.ternary;

public class Main {
  public static int x = 5;
  public static int y = 6;

  public static void ternaryStatement() {
    String result = (x < y) ? "x < y" : "x >= y";
    System.out.println(result);
  }

  public static void main(String[] args) {
    ternaryStatement();
  }
}
