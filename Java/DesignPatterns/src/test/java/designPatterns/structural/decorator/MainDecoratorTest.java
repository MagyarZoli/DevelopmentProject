package designPatterns.structural.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainDecoratorTest {
  private Component concreteCom;
  private Component decorateCom;

  @BeforeEach
  void setUp() {
    concreteCom = new ConcreteComponent();
    decorateCom = new ConcreteDecorator(new ConcreteComponent());
  }

  @Test
  void equalsTest() {
    assertThat(concreteCom.assemble()).isEqualTo("Concrete Component");
    assertThat(decorateCom.assemble()).isEqualTo("Concrete Component\nAdding Decorator");
  }
}
