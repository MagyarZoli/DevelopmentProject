package creational.abstractFactory

sealed class ConcreteProduct {
  class ProductA : AbstractProduct.A {
    override fun displayA(): String {
      return "Product A"
    }
  }

  class ProductB : AbstractProduct.B {
    override fun displayB(): String {
      return "Product B"
    }
  }
}
