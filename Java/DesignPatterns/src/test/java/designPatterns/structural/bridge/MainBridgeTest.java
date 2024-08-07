package designPatterns.structural.bridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainBridgeTest {

  private Abstraction abs1;
  private Abstraction abs2;

  @BeforeEach
  void setUp() {
    abs1 = new Refined(new ConcreteImplementor.A());
    abs2 = new Refined(new ConcreteImplementor.B());
  }

  @Test
  void equalsTest() {
    assertThat(abs1.doSomething()).isEqualTo("Refined: Applying A");
    assertThat(abs2.doSomething()).isEqualTo("Refined: Applying B");
  }
}
