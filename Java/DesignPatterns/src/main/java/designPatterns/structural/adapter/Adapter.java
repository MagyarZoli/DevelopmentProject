package designPatterns.structural.adapter;

public class Adapter implements Target {
  private Adaptee adaptee;

  public Adapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public String request() {
    return adaptee.specificRequest();
  }
}
