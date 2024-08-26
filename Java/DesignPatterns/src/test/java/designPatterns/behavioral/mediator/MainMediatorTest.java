package designPatterns.behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainMediatorTest {
  private Mediator mediator;
  private Model m1;
  private Model m2;

  @BeforeEach
  void setUp() {
    mediator = new ConcreteMediator();
    m1 = new ConcreteModel(mediator, "val1");
    m2 = new ConcreteModel(mediator, "val2");
    mediator.addModel(m1);
    mediator.addModel(m2);
  }

  @Test
  void equalsTest() {
    assertThat(m1.send("Hello everyone!")).isEqualTo("val1: Sending Message = Hello everyone!");
    assertThat(m2.receive("Hello")).isEqualTo("val2: Received Message = Hello");
  }
}
