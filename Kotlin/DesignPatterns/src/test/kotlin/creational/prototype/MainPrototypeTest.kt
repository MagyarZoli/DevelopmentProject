package creational.prototype

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainPrototypeTest {
  private lateinit var prototype1: ConcretePrototype
  private lateinit var prototype2: ConcretePrototype

  @BeforeEach
  internal fun setUp() {
    prototype1 = ConcretePrototype("initial state")
    prototype2 = prototype1.clone() as ConcretePrototype
  }

  @Test
  internal fun equalsTest() {
    assertThat(prototype1.showState()).isEqualTo(prototype2.showState())
  }
}