package designPatterns.creational.factoryMethod;

public abstract class Creator {
  public abstract Product factoryMethod();

  public String someOperation() {
    Product product = factoryMethod();
    return product.use();
  }
}
