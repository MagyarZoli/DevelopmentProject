package operators.comparison;

public class Main {
  public static void main(String[] args) {
    int x = 5;
    int y = 6;

    boolean equalTo = x == y;
    boolean notEqual = x != y;
    boolean greaterThan = x > y;
    boolean lessThan = x < y;
    boolean greaterThanOrEqualTo = x >= y;
    boolean lessThanOrEqualTo = x <= y;

    System.out.println(equalTo);
    System.out.println(notEqual);
    System.out.println(greaterThan);
    System.out.println(lessThan);
    System.out.println(greaterThanOrEqualTo);
    System.out.println(lessThanOrEqualTo);
  }
}
