package oop.polymorphism.interfacex;

public class Main {
  public static void abMethod(A aClass) {
    aClass.aMethod();
    //aClass.bMethod();
  }

  public static void main(String[] args) {
    B b = new B();
    C c = new C();

    b.b = "b field";
    //c.b = "b field";

    abMethod(b);
    abMethod(c);
  }
}
