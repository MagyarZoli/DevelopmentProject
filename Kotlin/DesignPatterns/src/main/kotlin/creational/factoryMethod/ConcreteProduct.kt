package creational.factoryMethod

class ConcreteProduct : Product {
  override fun use(): String {
    return "Using ConcreteProduct"
  }
}