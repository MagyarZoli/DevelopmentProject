package designPatterns.creational.abstractFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainAbstractFactoryTest {
  private AbstractFactory factory;
  private AbstractProduct.A productA;
  private AbstractProduct.B productB;

  @BeforeEach
  void setUp() {
    factory = new ConcreteFactory();
    productA = factory.createProductA();
    productB = factory.createProductB();
  }

  @Test
  void equalsTest() {
    assertThat(productA.displayA()).isEqualTo("Product A");
    assertThat(productB.displayB()).isEqualTo("Product B");
  }
}