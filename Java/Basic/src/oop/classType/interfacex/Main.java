package oop.classType.interfacex;

public class Main {
  public static void main(String[] args) {
    A a = new A() {
      @Override
      public int abstractMethod(int a, int b) {
        return a - a * b;
      }

      @Override
      public int defaultMethod(int a, int b) {
        return A.super.defaultMethod(a, b) - a;
      }
    };

    System.out.println(a.abstractMethod(2, 3));
    System.out.println(a.defaultMethod(2, 3));

    B b = new B();

    System.out.println(b.abstractMethod(2, 3));
    System.out.println(b.defaultMethod(2, 3));
  }
}
