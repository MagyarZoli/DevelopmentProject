package creational.factoryMethod

class ConcreteCreator : Creator() {
  override fun factoryMethod(): Product {
    return ConcreteProduct()
  }
}