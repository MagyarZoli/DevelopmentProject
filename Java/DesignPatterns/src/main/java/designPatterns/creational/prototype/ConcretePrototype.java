package designPatterns.creational.prototype;

public class ConcretePrototype implements Prototype {
  private String state;

  public ConcretePrototype(String state) {
    this.state = state;
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototype(state);
  }

  public String showState() {
    return "State: " + state;
  }
}
