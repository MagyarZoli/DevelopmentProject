package method.overload;

public class Main {
  public static void voidMethod() {
    System.out.println("...");
  }

  public static void voidMethod(String param1) {
    System.out.println(param1);
  }

  public static void voidMethod(int param1) {
    System.out.println(param1);
  }

  public static String returnMethod() {
    return "...";
  }

  public static String returnMethod(String param1) {
    return param1;
  }

  public static String returnMethod(int param1) {
    return String.valueOf(param1);
  }

  public static void main(String[] args) {
    voidMethod();
    voidMethod("parameters");
    voidMethod(3);

    System.out.println(returnMethod());
    System.out.println(returnMethod("parameters"));
    System.out.println(returnMethod(3));
  }
}
