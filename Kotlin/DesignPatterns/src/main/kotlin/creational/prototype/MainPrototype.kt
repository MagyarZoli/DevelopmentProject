package creational.prototype

fun main() {
  val prototype1 = ConcretePrototype("initial state")
  val prototype2 = prototype1.clone() as ConcretePrototype

  println("${prototype1.showState()}\n${prototype2.showState()}")
}