package designPatterns.creational.abstractFactory;

public class ConcreteProduct {
  static class ConcreteA implements AbstractProduct.A {
    @Override
    public String displayA() {
      return "Product A";
    }
  }

  static class ConcreteB implements AbstractProduct.B {
    @Override
    public String displayB() {
      return "Product B";
    }
  }
}
