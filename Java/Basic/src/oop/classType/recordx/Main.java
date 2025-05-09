package oop.classType.recordx;

public class Main {
  public static void main(String[] args) {
    A a = new A(2, 3);

    System.out.println(a.method());
    System.out.println(A.staticMethod(4, 5));
    System.out.println(a.finalMethod());
  }
}
