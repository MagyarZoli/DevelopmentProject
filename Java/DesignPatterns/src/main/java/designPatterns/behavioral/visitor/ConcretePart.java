package designPatterns.behavioral.visitor;

public class ConcretePart {
  static class A implements Part {
    @Override
    public String accept(Visitor visitor) {
      return visitor.visit(this);
    }
  }

  static class B implements Part {
    @Override
    public String accept(Visitor visitor) {
      return visitor.visit(this);
    }
  }

  static class C implements Part {
    @Override
    public String accept(Visitor visitor) {
      return visitor.visit(this);
    }
  }
}
