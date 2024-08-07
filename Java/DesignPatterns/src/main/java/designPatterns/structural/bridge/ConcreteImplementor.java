package designPatterns.structural.bridge;

public class ConcreteImplementor {
  static class A implements Implementor {
    @Override
    public String applyImplement() {
      return "Applying A";
    }
  }

  static class B implements Implementor {
    @Override
    public String applyImplement() {
      return "Applying B";
    }
  }
}
