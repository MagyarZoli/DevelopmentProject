package method.lambda;

public class Main {
  public static void voidMethod(A lambda1, int a, int b) {
    System.out.println(lambda1.invoke(a, b));
  }

  public static int returnMethod(A lambda1, int a, int b) {
    return lambda1.invoke(a, b);
  }

  public static void main(String[] args) {
    voidMethod(Integer::sum, 2, 3);
    voidMethod((a, b) -> {return a * b;}, 2, 3);
    System.out.println(returnMethod(Integer::sum, 2, 3));
    System.out.println(returnMethod((a, b) -> {return a * b;}, 2, 3));
  }
}
