package designPatterns.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {
  private String value;

  public ConcreteFlyweight(String value) {
    this.value = value;
  }

  @Override
  public String doSomething() {
    return "ConcreteFlyweight: " + value;
  }
}
