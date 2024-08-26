package designPatterns.behavioral.mediator;

public class MainMediator {
  public static void main(String[] args) {
    Mediator mediator = new ConcreteMediator();
    Model m1 = new ConcreteModel(mediator, "val1");
    Model m2 = new ConcreteModel(mediator, "val2");
    mediator.addModel(m1);
    mediator.addModel(m2);

    System.out.println(m1.send("Hello everyone!"));
    System.out.println(m2.receive("Hello"));
  }
}
