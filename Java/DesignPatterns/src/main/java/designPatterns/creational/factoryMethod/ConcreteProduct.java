package designPatterns.creational.factoryMethod;

public class ConcreteProduct implements Product {
  @Override
  public String use() {
    return "Using ConcreteProduct";
  }
}
