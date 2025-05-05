package oop.classType.interfacex;

public class B implements A {
  @Override
  public int abstractMethod(int a, int b) {
    return b - a * b;
  }

  @Override
  public int defaultMethod(int a, int b) {
    return A.super.defaultMethod(a, b) - b;
  }
}
