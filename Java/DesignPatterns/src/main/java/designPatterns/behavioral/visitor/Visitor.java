package designPatterns.behavioral.visitor;

public interface Visitor {
  String visit(ConcretePart.A a);
  String visit(ConcretePart.B b);
  String visit(ConcretePart.C c);
}
