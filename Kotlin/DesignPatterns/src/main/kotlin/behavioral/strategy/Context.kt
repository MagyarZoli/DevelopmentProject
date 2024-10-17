package behavioral.strategy

data class Context(var strategy: Strategy) {
  fun executeStrategy(num1: Int, num2: Int): Int = strategy.doOperation(num1, num2)
}
