package oop.inheritance.multilevel;

public class Main {
  public static void main(String[] args) {
    C c = new C();

    c.a = "a field";
    c.b = "b field";
    c.c = "c field";

    System.out.println(c.a);
    System.out.println(c.b);
    System.out.println(c.c);
    c.aMethod();
    c.bMethod();
    c.cMethod();
  }
}
