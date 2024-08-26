package designPatterns.structural.bridge;

public class Refined extends Abstraction {
  protected Refined(Implementor implementor) {
    super(implementor);
  }

  @Override
  String doSomething() {
    return "Refined: " + implementor.applyImplement();
  }
}
