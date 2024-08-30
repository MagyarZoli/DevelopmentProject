package creational.builder

class ConcreteBuilder : Builder {
  private val product = Product()

  override fun builderPart1() {
    product.part1 = "Part 1"
  }

  override fun builderPart2() {
    product.part2 = "Part 2"
  }

  override fun getResult(): Product {
    return product
  }
}