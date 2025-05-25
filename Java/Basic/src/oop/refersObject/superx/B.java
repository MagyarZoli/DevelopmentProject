package oop.refersObject.superx;

public class B extends A {

  public int b;

  public B(int a, int b) {
    super(a);
    this.b = b;
  }

  public int bMethod() {
    return this.a + b;
  }
}
