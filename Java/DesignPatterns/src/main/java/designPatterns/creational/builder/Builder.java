package designPatterns.creational.builder;

public interface Builder {
  void buildPart1();
  void buildPart2();
  Product getResult();
}
