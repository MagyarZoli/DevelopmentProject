package creational.abstractFactory

fun main() {
  val factory: AbstractFactory = ConcreteFactory()
  val productA = factory.createProductA()
  val productB = factory.createProductB()

  println("${productA.displayA()}\n${productB.displayB()}")
}