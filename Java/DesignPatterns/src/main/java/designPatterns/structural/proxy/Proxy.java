package designPatterns.structural.proxy;

public class Proxy implements Subject {
  private RealSubject realSubject;
  private String value;

  public Proxy(String value) {
    this.value = value;
  }

  @Override
  public String display() {
    if (realSubject == null) {
      realSubject = new RealSubject(value);
    }
    return realSubject.display();
  }
}
