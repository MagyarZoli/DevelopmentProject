package creational.singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainSingletonTest {

  private lateinit var s1: Singleton
  private lateinit var s2: Singleton

  @BeforeEach
  internal fun setUp() {
    s1 = Singleton.getInstance()!!
    s2 = Singleton.getInstance()!!
  }

  @Test
  internal fun equalsTest() {
    assertThat(s1).isEqualTo(s2)
    assertThat(s1.date).isEqualTo(s2.date)
  }
}