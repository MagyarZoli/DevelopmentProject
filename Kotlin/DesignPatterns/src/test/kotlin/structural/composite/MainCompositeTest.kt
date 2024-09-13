package structural.composite

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainCompositeTest {
  private lateinit var leafA: Leaf.A
  private lateinit var leafB: Leaf.B
  private lateinit var composite: Composite

  @BeforeEach
  internal fun setUp() {
    leafA = Leaf.A("leafA", 100)
    leafB = Leaf.B("leafB", 101, true)
    composite = Composite()
    composite.addComponent(leafA)
    composite.addComponent(leafB)
  }

  @Test
  internal fun equalsTest() {
    assertThat(composite.show()).isEqualTo("leafA, 100\nleafB, 101, true\n")
  }
}