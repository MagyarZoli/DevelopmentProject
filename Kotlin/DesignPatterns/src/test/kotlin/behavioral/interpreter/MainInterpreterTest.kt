package behavioral.interpreter

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class MainInterpreterTest {
  private lateinit var isMale: Expression
  private lateinit var isMarried: Expression
  private lateinit var isMarriedAndMale: Expression

  @BeforeEach
  internal fun setUp() {
    isMale = ConcreteExpression.TerminalExpression("John")
    isMarried = ConcreteExpression.TerminalExpression("Married")
    isMarriedAndMale = ConcreteExpression.AndExpression(isMale, isMarried)
  }

  @Test
  internal fun equalsTest() {
    assertTrue(isMale.interpret("John"))
    assertTrue(isMarried.interpret("Married"))
    assertTrue(isMarriedAndMale.interpret("John Married"))
  }
}