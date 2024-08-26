package designPatterns.structural.decorator;

public class ConcreteDecorator extends Decorator {
  public ConcreteDecorator(Component component) {
    super(component);
  }

  @Override
  public String assemble() {
    return super.assemble() + "\nAdding Decorator";
  }
}
