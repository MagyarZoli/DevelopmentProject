package oop.annotationx.classx;

@A(param1 = "World")
public class D implements C {
  @Override
  public void method1() {
    System.out.println("Hello");
  }

  @Override
  public void method2() {
    System.out.println("Good bye");
  }
}
