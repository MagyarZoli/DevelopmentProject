package designPatterns.creational.builder;

public class Director {
  public Director(Builder builder) {
    builder.buildPart1();
    builder.buildPart2();
  }
}
