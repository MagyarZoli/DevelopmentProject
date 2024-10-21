package behavioral.strategy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MainStrategyTest {
  private lateinit var context: Context

  @Test
  internal fun equalsTest() {
    context = Context(Operation.Add())
    assertThat(context.executeStrategy(10, 5)).isEqualTo(10 + 5)

    context = Context(Operation.Subtract())
    assertThat(context.executeStrategy(10, 5)).isEqualTo(10 - 5)

    context = Context(Operation.Multiply())
    assertThat(context.executeStrategy(10, 5)).isEqualTo(10 * 5)
  }
}