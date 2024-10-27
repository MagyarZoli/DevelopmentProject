package behavioral.chain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainChainTest {
  private lateinit var handlerA: Handler
  private lateinit var handlerB: Handler

  @BeforeEach
  internal fun setUp() {
    handlerA = ConcreteHandler.A()
    handlerB = ConcreteHandler.B()
    handlerA.next = handlerB
  }

  @Test
  internal fun equalsTest() {
    assertThat(handlerA.handleRequest("one")).isEqualTo("ConcreteHandlerA")
    assertThat(handlerB.handleRequest("two")).isEqualTo("ConcreteHandlerB")
  }
}