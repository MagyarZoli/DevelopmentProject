package structural.adapter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainAdapterTest {

  private lateinit var adaptee: Adaptee
  private lateinit var target: Target

  @BeforeEach
  internal fun setUp() {
    adaptee = Adaptee()
    target = Adapter(adaptee)
  }

  @Test
  internal fun equalsTest() {
    assertThat(target.request()).isEqualTo("Called specificRequest")
  }
}