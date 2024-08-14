package designPatterns.structural.flyweight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainFlyweightTest {
  private ConcreteFlyweight concreteFly;

  @BeforeEach
  void setUp() {
    concreteFly = (ConcreteFlyweight) FlyweightFactory.getConcreteFlyweight("value");
  }

  @Test
  void equalsTest() {
    assertThat(concreteFly.doSomething()).isEqualTo("ConcreteFlyweight: value");
  }
}
