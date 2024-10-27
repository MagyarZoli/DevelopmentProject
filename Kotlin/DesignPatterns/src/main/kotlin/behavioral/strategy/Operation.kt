package behavioral.strategy

sealed class Operation {
  class Add : Strategy {
    override fun doOperation(num1: Int, num2: Int): Int = num1 + num2
  }

  class Subtract : Strategy {
    override fun doOperation(num1: Int, num2: Int): Int = num1 - num2
  }

  class Multiply : Strategy {
    override fun doOperation(num1: Int, num2: Int): Int = num1 * num2
  }
}
