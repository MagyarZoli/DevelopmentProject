package oop.classType.abstractx;

public class B extends A {

  public B(int a, int b) {
    super(a, b);
  }

  @Override
  public int abstractMethod() {
    return this.a * b;
  }

  @Override
  public int method() {
    return this.a * a;
  }

  public static int staticMethod(int a, int b) {
    return b * b;
  }
}
