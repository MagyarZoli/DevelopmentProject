package oop.polymorphism.interfacex;

public class B implements A {
  public String b = null;

  @Override
  public void aMethod() {
    System.out.println("b override a method");
  }

  public void bMethod() {
    System.out.println("b method");
  }
}
