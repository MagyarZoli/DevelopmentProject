package designPatterns.structural.facade;

public class SubClass {
  public static class A {
    public String doSomethingA() {
      return "SubClassA";
    }
  }

  public static class B {
    public Integer doSomethingB() {
      return 100;
    }
  }

  public static class C {
    public Boolean doSomethingC() {
      return true;
    }
  }
}
