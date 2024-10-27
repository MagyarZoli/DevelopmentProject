package structural.flyweight

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainFlyweightTest {
  private lateinit var concreteFly: ConcreteFlyweight

  @BeforeEach
  internal fun setUp() {
    concreteFly = FlyweightFactory.getConcreteFlyweight("value") as ConcreteFlyweight
  }

  @Test
  internal fun equalsTest() {
    assertThat(concreteFly.doSomething()).isEqualTo("ConcreteFlyweight: value")
  }
}