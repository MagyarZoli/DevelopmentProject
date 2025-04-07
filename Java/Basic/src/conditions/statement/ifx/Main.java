package conditions.statement.ifx;

public class Main {
  public static int x = 5;
  public static int y = 6;

  public static void ifStatement() {
    if (x == y) {
      System.out.println("x == y");
    }
    System.out.println("x, y");
  }

  public static void elseStatement() {
    if (x == y) {
      System.out.println("x == y");
    } else {
      System.out.println("x != y");
    }
    System.out.println("x, y");
  }

  public static void elseIfStatement() {
    if (x == y) {
      System.out.println("x == y");
    } else if (x < y) {
      System.out.println("x < y");
    } else {
      System.out.println("x > y");
    }
    // if (x == y)
    //   System.out.println("x == y");
    // else if (x < y)
    //   System.out.println("x < y");
    // else
    //  System.out.println("x > y");
    // if (x == y) System.out.println("x == y");
    // else if (x < y) System.out.println("x < y");
    // else System.out.println("x > y");
    System.out.println("x, y");
  }

  public static void main(String[] args) {
    ifStatement();
    elseStatement();
    elseIfStatement();
  }
}
