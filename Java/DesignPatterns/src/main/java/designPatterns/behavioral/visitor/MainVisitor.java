package designPatterns.behavioral.visitor;

public class MainVisitor {
  public static void main(String[] args) {
    Part part = new ConcretePart.A();
    System.out.println(part.accept(new DisplayVisitor()));

    part = new ConcretePart.B();
    System.out.println(part.accept(new DisplayVisitor()));

    part = new ConcretePart.C();
    System.out.println(part.accept(new DisplayVisitor()));
  }
}
