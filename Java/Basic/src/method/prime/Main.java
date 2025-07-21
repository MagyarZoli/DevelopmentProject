package method.prime;

public class Main {
  public static void voidMethod(int param1) {
    System.out.println(param1);
  }

  public static double returnMethod(int param1) {
    return param1;
  }

  public static void main(String[] args) {
    voidMethod(3);
    System.out.println(returnMethod(3));
  }
}
