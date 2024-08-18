package designPatterns.behavioral.interpreter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainInterpreterTest {
  private Expression isMale;
  private Expression isMarried;
  private Expression isMarriedAndMale;

  @BeforeEach
  void setUp() {
    isMale = new ConcreteExpression.TerminalExpression("John");
    isMarried = new ConcreteExpression.TerminalExpression("Married");
    isMarriedAndMale = new ConcreteExpression.AndExpression(isMale, isMarried);
  }

  @Test
  void equalsTest() {
    assertTrue(isMale.interpret("John"));
    assertTrue(isMarried.interpret("Married"));
    assertTrue(isMarriedAndMale.interpret("John Married"));
  }
}
