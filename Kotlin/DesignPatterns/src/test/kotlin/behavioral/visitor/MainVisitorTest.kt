package behavioral.visitor

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MainVisitorTest {
  private lateinit var part: Part

  @Test
  internal fun equalsTest() {
    part = ConcretePart.A()
    assertThat(part.accept(DisplayVisitor())).isEqualTo("Displaying A")

    part = ConcretePart.B()
    assertThat(part.accept(DisplayVisitor())).isEqualTo("Displaying B")

    part = ConcretePart.C()
    assertThat(part.accept(DisplayVisitor())).isEqualTo("Displaying C")
  }
}