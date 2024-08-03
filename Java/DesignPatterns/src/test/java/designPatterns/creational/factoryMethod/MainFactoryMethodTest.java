package designPatterns.creational.factoryMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainFactoryMethodTest {
  private Creator cre;

  @BeforeEach
  void setUp() {
    cre = new ConcreteCreator();
  }

  @Test
  void equalsTest() {
    assertThat(cre.someOperation()).isEqualTo("Using ConcreteProduct");
  }
}
