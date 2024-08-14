package designPatterns.structural.flyweight;

public class FlyweightFactory {
  public static Flyweight getConcreteFlyweight(String value) {
    return new ConcreteFlyweight(value);
  }
}
