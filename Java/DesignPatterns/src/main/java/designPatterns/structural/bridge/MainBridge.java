package designPatterns.structural.bridge;

public class MainBridge {
  public static void main(String[] args) {
    Abstraction abs1 = new Refined(new ConcreteImplementor.A());
    Abstraction abs2 = new Refined(new ConcreteImplementor.B());

    System.out.println(abs1.doSomething() + "\n" + abs2.doSomething());
  }
}
