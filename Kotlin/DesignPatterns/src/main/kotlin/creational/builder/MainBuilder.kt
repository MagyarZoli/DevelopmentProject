package creational.builder

fun main() {
  var builder = ConcreteBuilder()
  var director = Director(builder)
  var product = builder.getResult()

  println(product.show())
}