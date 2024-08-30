package creational.builder

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MainBuilderTest {
  private lateinit var builder: ConcreteBuilder
  private lateinit var director: Director
  private lateinit var product: Product

  internal fun setUp1() {
    builder = ConcreteBuilder()
    director = Director(builder)
    product = builder.getResult()
  }

  internal fun setUp2() {
    builder = ConcreteBuilder()
    product = builder.getResult()
  }

  @Test
  internal fun equalsTest() {
    setUp1()
    assertThat(product.show()).isEqualTo("Product with Part 1 and Part 2")
  }

  @Test
  internal fun notEqualsTest() {
    setUp2()
    assertThat(product.show()).isNotEqualTo("Product with Part 1 and Part 2")
  }

  @Test
  internal fun isNotNullTest() {
    setUp1();
    assertThat(builder).isNotNull;
    assertThat(director).isNotNull;
    assertThat(product).isNotNull;
  }

  @Test
  internal fun isNullTest() {
    setUp2();
    assertThat(builder).isNotNull;
    assertThat(director).isNull();
    assertThat(product).isNotNull;
  }
}