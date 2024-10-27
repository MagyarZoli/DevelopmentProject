package behavioral.strategy

fun main() {
  var context = Context(Operation.Add())
  println("10 + 5 = ${context.executeStrategy(10, 5)}")

  context = Context(Operation.Subtract())
  println("10 - 5 = ${context.executeStrategy(10, 5)}")

  context = Context(Operation.Multiply())
  println("10 * 5 = ${context.executeStrategy(10, 5)}")
}