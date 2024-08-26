package designPatterns.creational.abstractFactory;

public interface AbstractFactory {
  AbstractProduct.A createProductA();
  AbstractProduct.B createProductB();
}
