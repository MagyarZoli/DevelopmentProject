package designPatterns.structural.facade;

public class Facade {
  private SubClass.A subClassA;
  private SubClass.B subClassB;
  private SubClass.C subClassC;

  public Facade() {
    subClassA = new SubClass.A();
    subClassB = new SubClass.B();
    subClassC = new SubClass.C();
  }

  public String start() {
    return subClassA.doSomethingA() + ", " + subClassB.doSomethingB() + ", " + subClassC.doSomethingC();
  }
}
