package designPatterns.creational.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainPrototypeTest {
  private ConcretePrototype prototype1;
  private ConcretePrototype prototype2;

  @BeforeEach
  void setUp() {
    prototype1 = new ConcretePrototype("initial state");
    prototype2 = (ConcretePrototype) prototype1.clone();
  }

  @Test
  void equalsTest() {
    assertThat(prototype1.showState()).isEqualTo(prototype2.showState());
  }
}
