package structural.bridge

fun main() {
  var abs1 = Refined(ConcreteImplementor.A())
  var abs2 = Refined(ConcreteImplementor.B())

  println(abs1.doSomething())
  println(abs2.doSomething())
}