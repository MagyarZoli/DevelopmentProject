package method.override;

public class B extends A {
  @Override
  public void aMethod() {
    System.out.println("b method");
  }

  public static void aStaticMethod() {
    System.out.println("b static method");
  }
}
