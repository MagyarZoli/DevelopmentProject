package oop.classType.abstractx;

public abstract class A {
  public int a;
  public int b;

  public A(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public abstract int abstractMethod();

  public int method() {
    return a + b;
  }

  public static int staticMethod(int a, int b) {
    return a - b;
  }

  public final int finalMethod() {
    return b - a;
  }
}
