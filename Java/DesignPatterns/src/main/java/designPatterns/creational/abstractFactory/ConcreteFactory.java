package designPatterns.creational.abstractFactory;

public class ConcreteFactory implements AbstractFactory {
  @Override
  public AbstractProduct.A createProductA() {
    return new ConcreteProduct.ConcreteA();
  }

  @Override
  public AbstractProduct.B createProductB() {
    return new ConcreteProduct.ConcreteB();
  }
}
