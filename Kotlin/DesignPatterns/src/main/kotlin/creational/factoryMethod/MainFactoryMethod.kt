package creational.factoryMethod

fun main() {
  val cre: Creator = ConcreteCreator()

  println(cre.someOperation())
}