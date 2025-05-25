package oop.refersObject.superx;

public class Main {
  public static void main(String[] args) {
    B b = new B(3, 4);
    C c = new C(3);

    System.out.println(b.bMethod());
    System.out.println(c.cMethod());
  }
}
