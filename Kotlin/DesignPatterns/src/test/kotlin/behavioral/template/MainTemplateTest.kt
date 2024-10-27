package behavioral.template

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MainTemplateTest {
  private lateinit var sup: Super

  @Test
  internal fun equalsTest() {
    sup = ConcreteSub.A()
    assertThat(sup.play()).isEqualTo("A initialized!\nA started.\nA finished!")

    sup = ConcreteSub.B()
    assertThat(sup.play()).isEqualTo("B initialized!\nB started.\nB finished!")
  }
}