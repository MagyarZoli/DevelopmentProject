package creational.abstractFactory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainAbstractFactoryTest {

  private lateinit var factory: AbstractFactory
  private lateinit var productA: AbstractProduct.A
  private lateinit var productB: AbstractProduct.B

  @BeforeEach
  internal fun setUp() {
    factory = ConcreteFactory()
    productA = factory.createProductA()
    productB = factory.createProductB()
  }

  @Test
  internal fun equalsTest() {
    assertThat(productA.displayA()).isEqualTo("Product A")
    assertThat(productB.displayB()).isEqualTo("Product B")
  }
}