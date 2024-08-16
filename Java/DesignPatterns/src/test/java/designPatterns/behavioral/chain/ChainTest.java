package designPatterns.behavioral.chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChainTest {
  private Handler handlerA;
  private Handler handlerB;

  @BeforeEach
  void setUp() {
    handlerA = new ConcreteHandler.A();
    handlerB = new ConcreteHandler.B();
    handlerA.setNext(handlerB);
  }

  @Test
  void equalsTest() {
    assertThat(handlerA.handleRequest("one")).isEqualTo("ConcreteHandlerA");
    assertThat(handlerA.handleRequest("two")).isEqualTo("ConcreteHandlerB");
  }
}
