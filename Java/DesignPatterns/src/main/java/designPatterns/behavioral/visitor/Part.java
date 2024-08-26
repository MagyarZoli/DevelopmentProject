package designPatterns.behavioral.visitor;

public interface Part {
  String accept(Visitor visitor);
}
