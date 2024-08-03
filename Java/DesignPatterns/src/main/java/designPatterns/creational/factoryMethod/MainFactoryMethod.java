package designPatterns.creational.factoryMethod;

public class MainFactoryMethod {
  public static void main(String[] args) {
    Creator cre = new ConcreteCreator();

    System.out.println(cre.someOperation());
  }
}
