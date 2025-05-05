package oop.classType.interfacex;

public interface A {
  int abstractMethod(int a, int b);

  default int defaultMethod(int a, int b) {
    return a - b;
  }
}
