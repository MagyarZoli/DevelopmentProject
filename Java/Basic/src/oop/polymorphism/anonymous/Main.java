package oop.polymorphism.anonymous;

public class Main {
  public static void abMethod(A aClass) {
    aClass.aMethod();
    //aClass.bMethod();
  }

  public static void main(String[] args) {
    abMethod(new A() {
      @Override
      public void aMethod() {
        System.out.println("anonymous b method");
        bMethod();
      }

      public void bMethod() {
        System.out.println("b method");
      }
    });

    abMethod(new A() {
      @Override
      public void aMethod() {
        System.out.println("anonymous c method");
      }

      public void bMethod() {
        System.out.println("c method");
      }
    });
  }
}
