package behavioral.mediator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainMediatorTest {
  private lateinit var mediator: Mediator
  private lateinit var m1: Model
  private lateinit var m2: Model

  @BeforeEach
  internal fun setUp() {
    mediator = ConcreteMediator();
    m1 = ConcreteModel(mediator, "val1")
    m2 = ConcreteModel(mediator, "val2")
    mediator.addModel(m1)
    mediator.addModel(m2)
  }

  @Test
  internal fun equalsTest() {
    assertThat(m1.send("Hello everyone!")).isEqualTo("val1: Sending Message = Hello everyone!")
    assertThat(m2.receive("Hello")).isEqualTo("val2: Received Message = Hello")
  }
}