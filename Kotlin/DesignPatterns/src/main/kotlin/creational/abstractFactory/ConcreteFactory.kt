package creational.abstractFactory

class ConcreteFactory : AbstractFactory {
  override fun createProductA(): AbstractProduct.A {
    return ConcreteProduct.ProductA()
  }

  override fun createProductB(): AbstractProduct.B {
    return ConcreteProduct.ProductB()
  }
}