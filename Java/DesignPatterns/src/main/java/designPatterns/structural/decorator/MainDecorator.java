package designPatterns.structural.decorator;

public class MainDecorator {
  public static void main(String[] args) {
    Component concreteCom = new ConcreteComponent();
    Component decorateCom = new ConcreteDecorator(new ConcreteComponent());

    System.out.println(concreteCom.assemble());
    System.out.println(decorateCom.assemble());
  }
}
