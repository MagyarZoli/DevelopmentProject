package designPatterns.behavioral.chain;

public class MainChain {
  public static void main(String[] args) {
    Handler handlerA = new ConcreteHandler.A();
    Handler handlerB = new ConcreteHandler.B();
    handlerA.setNext(handlerB);

    System.out.println(handlerA.handleRequest("one"));
    System.out.println(handlerA.handleRequest("two"));
  }
}
