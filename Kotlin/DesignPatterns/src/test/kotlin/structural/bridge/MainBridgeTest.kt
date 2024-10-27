package structural.bridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainBridgeTest {
  private lateinit var abs1: Abstraction
  private lateinit var abs2: Abstraction

  @BeforeEach
  internal fun setUp() {
    abs1 = Refined(ConcreteImplementor.A())
    abs2 = Refined(ConcreteImplementor.B())
  }

  @Test
  internal fun equalsTest() {
    assertThat(abs1.doSomething()).isEqualTo("Refined: Applying A")
    assertThat(abs2.doSomething()).isEqualTo("Refined: Applying B")
  }
}