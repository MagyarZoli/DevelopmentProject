package behavioral.interpreter

fun main() {
  var isMale = ConcreteExpression.TerminalExpression("John")
  var isMarried = ConcreteExpression.TerminalExpression("Married")
  var isMarriedAndMale = ConcreteExpression.AndExpression(isMale, isMarried)

  println(isMale.interpret("John"))
  println(isMarried.interpret("Married"))
  println(isMarriedAndMale.interpret("John Married"))
}