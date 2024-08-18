package designPatterns.behavioral.interpreter;

public class MainInterpreter {
  public static void main(String[] args) {
    Expression isMale = new ConcreteExpression.TerminalExpression("John");
    Expression isMarried = new ConcreteExpression.TerminalExpression("Married");
    Expression isMarriedAndMale = new ConcreteExpression.AndExpression(isMale, isMarried);

    System.out.println(isMale.interpret("John"));
    System.out.println(isMarried.interpret("Married"));
    System.out.println(isMarriedAndMale.interpret("John Married"));
  }
}
