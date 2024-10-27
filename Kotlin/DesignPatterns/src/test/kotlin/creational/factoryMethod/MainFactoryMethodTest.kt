package creational.factoryMethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainFactoryMethodTest {

  private lateinit var cre: Creator

  @BeforeEach
  internal fun setUp() {
    cre = ConcreteCreator()
  }

  @Test
  internal fun equalsTest() {
    assertThat(cre.someOperation()).isEqualTo("Using ConcreteProduct")
  }
}