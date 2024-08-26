package designPatterns.structural.composite;

public class MainComposite {
  public static void main(String[] args) {
    Leaf.A leafA = new Leaf.A("leafA", 100);
    Leaf.B leafB = new Leaf.B("leafB", 101, true);
    Composite composite = new Composite();
    composite.addComponent(leafA);
    composite.addComponent(leafB);

    System.out.println(composite.show());
  }
}
