package designPatterns.structural.adapter;

public class MainAdapter {
  public static void main(String[] args) {
    Adaptee adaptee = new Adaptee();
    Target target = new Adapter(adaptee);

    System.out.println(target.request());
  }
}
