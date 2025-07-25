package method.object;

public class Main {
  public static void voidMethod(A param1) {
    System.out.println(param1.toString());
  }

  public static A returnMethod(A param1) {
    return new A(param1.field);
  }

  public static void main(String[] args) {
    voidMethod(new A("parameters"));
    System.out.println(returnMethod(new A("parameters")));
  }
}
