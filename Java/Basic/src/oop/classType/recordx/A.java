package oop.classType.recordx;

public record A(int a, int b) {
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
