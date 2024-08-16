package designPatterns.behavioral.chain;

public abstract class Handler {
  protected Handler next;

  public void setNext(Handler next) {
    this.next = next;
  }

  public abstract String handleRequest(String request);
}
