package operators.logical;

public class Main {
  public static void main(String[] args) {
    boolean x = true;
    boolean y = false;

    boolean logicalAnd = x && y;
    boolean logicalOr = x || y;
    boolean logicalNot = !x;

    System.out.println(logicalAnd);
    System.out.println(logicalOr);
    System.out.println(logicalNot);
  }
}
