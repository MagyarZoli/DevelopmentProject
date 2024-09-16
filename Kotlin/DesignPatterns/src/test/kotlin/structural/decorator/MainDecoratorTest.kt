package structural.decorator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainDecoratorTest {
  private lateinit var concreteCom: Component
  private lateinit var decorateCom: Component

  @BeforeEach
  internal fun setUp() {
    concreteCom = ConcreteComponent()
    decorateCom = ConcreteDecorator(ConcreteComponent())
  }

  @Test
  internal fun equalsTest() {
    assertThat(concreteCom.assemble()).isEqualTo("Concrete Component")
    assertThat(decorateCom.assemble()).isEqualTo("Concrete Component\nAdding Decorator")
  }
}