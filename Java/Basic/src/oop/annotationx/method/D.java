package oop.annotationx.method;

public class D implements C {
  @A(param1 = "World")
  @Override
  public void method1() {
    System.out.println("Hello");
  }

  @Override
  public void method2() {
    System.out.println("Good bye");
  }
}
