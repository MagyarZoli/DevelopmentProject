package structural.proxy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainProxyTest {
  private lateinit var subject: Subject

  @BeforeEach
  internal fun setUp() {
    subject = Proxy("proxyValue")
  }

  @Test
  internal fun equalsTest() {
    assertThat(subject.display()).isEqualTo("Displaying proxyValue")
  }
}