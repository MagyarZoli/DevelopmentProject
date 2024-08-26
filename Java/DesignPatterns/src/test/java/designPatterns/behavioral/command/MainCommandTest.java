package designPatterns.behavioral.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainCommandTest {
  private Receiver receiver;
  private Command commandA;
  private Command commandB;
  private Invoker invoker;

  @BeforeEach
  void setUp() {
    receiver = new Receiver();
    commandA = new ConcreteCommand.A(receiver);
    commandB = new ConcreteCommand.B(receiver);
    invoker = new Invoker();
  }

  @Test
  void equalsTest() {
    invoker.setCommand(commandA);
    assertThat(invoker.invokeExecute()).isEqualTo("A");

    invoker.setCommand(commandB);
    assertThat(invoker.invokeExecute()).isEqualTo("B");
  }
}
