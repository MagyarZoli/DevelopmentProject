package designPatterns.creational.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainBuilderTest {
  private Builder builder;
  private Director director;
  private Product product;

  void setUp1() {
    builder = new ConcreteBuilder();
    director = new Director(builder);
    product = builder.getResult();
  }

  void setUp2() {
    builder = new ConcreteBuilder();
    product = builder.getResult();
  }

  @Test
  void equalsTest() {
    setUp1();
    assertThat(product.show()).isEqualTo("Product with Part 1 and Part 2");
  }

  @Test
  void notEqualsTest() {
    setUp2();
    assertThat(product.show()).isNotEqualTo("Product with Part 1 and Part 2");
  }
}
