package behavioral.interpreter

sealed class ConcreteExpression {
  data class TerminalExpression(private var data: String) : Expression {
    override fun interpret(context: String): Boolean = context.contains(data)
  }

  data class OrExpression(private var exp1: Expression, private var exp2: Expression) : Expression {
    override fun interpret(context: String): Boolean = exp1.interpret(context) || exp2.interpret(context)
  }

  data class AndExpression(private var exp1: Expression, private var exp2: Expression) : Expression {
    override fun interpret(context: String): Boolean = exp1.interpret(context) && exp2.interpret(context)
  }
}
