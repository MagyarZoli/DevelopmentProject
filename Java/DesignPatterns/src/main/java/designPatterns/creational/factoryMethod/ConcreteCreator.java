package designPatterns.creational.factoryMethod;

public class ConcreteCreator extends Creator {
  @Override
  public Product factoryMethod() {
    return new ConcreteProduct();
  }
}
