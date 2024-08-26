package designPatterns.structural.proxy;

public class MainProxy {
  public static void main(String[] args) {
    Subject subject = new Proxy("proxyValue");

    System.out.println(subject.display());
  }
}
