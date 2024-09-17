package structural.facade

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainFacadeTest {
  private lateinit var facade: Facade

  @BeforeEach
  internal fun setUp() {
    facade = Facade()
  }

  @Test
  internal fun equalsTest() {
    assertThat(facade.start()).isEqualTo("SubClassA, 100, true")
  }
}