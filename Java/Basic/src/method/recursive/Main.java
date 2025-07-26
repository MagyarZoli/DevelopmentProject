package method.recursive;

public class Main {
  public static void factorial(int n) {
    if (n >= 1) {
      System.out.println(n);
      factorial(n - 1);
    }
  }

  public static int returnFactorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * returnFactorial(n - 1);
  }

  public static void main(String[] args) {
    factorial(5);
    System.out.println(returnFactorial(5));
  }
}
