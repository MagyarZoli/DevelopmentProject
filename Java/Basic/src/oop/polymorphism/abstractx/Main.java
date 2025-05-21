package oop.polymorphism.abstractx;

public class Main {
  public static void changeAFiled(A aClass, String a) {
    aClass.a = a;
  }

  public static void abMethod(A aClass) {
    aClass.aMethod();
    //aClass.bMethod();
  }

  public static void main(String[] args) {
    B b = new B();
    C c = new C();

    changeAFiled(b, "b field");
    changeAFiled(c, "c field");

    b.b = "b field";
    //c.b = "b field";

    System.out.println(b.a);
    System.out.println(c.a);
    System.out.println(b.b);
    //System.out.println(c.b);

    abMethod(b);
    abMethod(c);
  }
}
