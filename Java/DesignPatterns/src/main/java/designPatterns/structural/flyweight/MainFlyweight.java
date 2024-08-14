package designPatterns.structural.flyweight;

public class MainFlyweight {
  public static void main(String[] args) {
    ConcreteFlyweight concreteFly = (ConcreteFlyweight) FlyweightFactory.getConcreteFlyweight("value");

    System.out.println(concreteFly.doSomething());
  }
}
