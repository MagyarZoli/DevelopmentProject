package designPatterns.structural.bridge;

public abstract class Abstraction {
  protected Implementor implementor;

  protected Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  abstract String doSomething();
}