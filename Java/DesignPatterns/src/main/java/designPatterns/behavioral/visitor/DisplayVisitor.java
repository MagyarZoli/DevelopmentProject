package designPatterns.behavioral.visitor;

public class DisplayVisitor implements Visitor {
  @Override
  public String visit(ConcretePart.A a) {
    return "Displaying A";
  }

  @Override
  public String visit(ConcretePart.B b) {
    return "Displaying B";
  }

  @Override
  public String visit(ConcretePart.C c) {
    return "Displaying C";
  }
}
