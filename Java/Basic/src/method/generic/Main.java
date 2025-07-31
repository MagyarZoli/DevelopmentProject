package method.generic;

public class Main {
  public static <T extends Number> void voidMethod(T param1) {
    System.out.println(param1.toString());
  }

  public static <T extends Number> T returnMethod(T param1) {
    return param1;
  }

  public static void main(String[] args) {
    voidMethod(3);
    System.out.println(returnMethod(3));
  }
}
