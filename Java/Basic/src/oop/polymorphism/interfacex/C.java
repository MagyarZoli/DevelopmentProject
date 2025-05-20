package oop.polymorphism.interfacex;

public class C implements A {
  @Override
  public void aMethod() {
    System.out.println("c override a method");
  }

  public void bMethod() {
    System.out.println("b method");
  }
}
