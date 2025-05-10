package oop.inheritance.solo;

public class Main {
  public static void main(String[] args) {
    B b = new B();

    b.a = "a field";
    b.b = "b filed";

    System.out.println(b.a);
    System.out.println(b.b);
    b.aMethod();
    b.bMethod();
  }
}
