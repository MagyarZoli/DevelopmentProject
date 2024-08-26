package designPatterns.creational.prototype;

public class MainPrototype {
  public static void main(String[] args) {
    ConcretePrototype prototype1 = new ConcretePrototype("initial state");
    ConcretePrototype prototype2 = (ConcretePrototype) prototype1.clone();

    System.out.println(prototype1.showState() + "\n" + prototype2.showState());
  }
}
