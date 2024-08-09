package designPatterns.structural.decorator;

public class ConcreteComponent implements Component {
  @Override
  public String assemble() {
    return "Concrete Component";
  }
}
