package designPatterns.creational.abstractFactory;

public class MainAbstractFactory {
  public static void main(String[] args) {
    AbstractFactory factory = new ConcreteFactory();
    AbstractProduct.A productA = factory.createProductA();
    AbstractProduct.B productB = factory.createProductB();

    System.out.println(productA.displayA() + "\n" + productB.displayB());
  }
}
