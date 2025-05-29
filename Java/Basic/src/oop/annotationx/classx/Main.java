package oop.annotationx.classx;

public class Main {
  public static void main(String[] args) {
    C c = B.createProxy(new D());
    c.method1();
    c.method2();
  }
}
