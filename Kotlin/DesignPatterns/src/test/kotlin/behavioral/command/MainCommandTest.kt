package behavioral.command

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainCommandTest {
  private lateinit var receiver: Receiver
  private lateinit var commandA: Command
  private lateinit var commandB: Command
  private lateinit var invoker: Invoker

  @BeforeEach
  internal fun setUp() {
    receiver = Receiver()
    commandA = ConcreteCommand.A(receiver)
    commandB = ConcreteCommand.B(receiver)
    invoker = Invoker()
  }

  @Test
  internal fun equalsTest() {
    invoker.command = commandA
    assertThat(invoker.invokeExecute()).isEqualTo("A")

    invoker.command = commandB
    assertThat(invoker.invokeExecute()).isEqualTo("B")
  }
}