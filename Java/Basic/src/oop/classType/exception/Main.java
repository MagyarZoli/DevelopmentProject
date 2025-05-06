package oop.classType.exception;

public class Main {
  public static void throwException() throws A {
    throw new A("A conditions.exception!");
  }

  public static void method() {
    try {
      throwException();
    } catch (A e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    method();
  }
}
