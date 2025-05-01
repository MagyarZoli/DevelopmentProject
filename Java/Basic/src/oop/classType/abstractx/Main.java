package oop.classType.abstractx;

public class Main {
  public static void main(String[] args) {
    A a = new A(2, 3) {
      @Override
      public int abstractMethod() {
        return this.a * a - b;
      }

      @Override
      public int method() {
        return super.method() - this.b * b;
      }
    };

    System.out.println(a.abstractMethod());
    System.out.println(a.method());
    System.out.println(A.staticMethod(4, 5));
    System.out.println(a.finalMethod());

    B b = new B(2, 3);

    System.out.println(b.abstractMethod());
    System.out.println(b.method());
    System.out.println(B.staticMethod(4, 5));
    System.out.println(b.finalMethod());
  }
}
