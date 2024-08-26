package designPatterns.structural.proxy;

public class RealSubject implements Subject {
  private String value;

  public RealSubject(String value) {
    this.value = value;
  }

  @Override
  public String display() {
    return "Displaying " + value;
  }
}
