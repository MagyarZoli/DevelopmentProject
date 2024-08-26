package designPatterns.creational.builder;

public class MainBuilder {
  public static void main(String[] args) {
    Builder builder = new ConcreteBuilder();
    Director director = new Director(builder);
    Product product = builder.getResult();

    System.out.println(product.show());
  }
}
