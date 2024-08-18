package designPatterns.behavioral.interpreter;

public class ConcreteExpression {
  static class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
      this.data = data;
    }

    @Override
    public boolean interpret(String context) {
      return context.contains(data);
    }
  }

  static class OrExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public OrExpression(Expression exp1, Expression exp2) {
      this.exp1 = exp1;
      this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
      return exp1.interpret(context) || exp2.interpret(context);
    }
  }

  static class AndExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
      this.exp1 = exp1;
      this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
      return exp1.interpret(context) && exp2.interpret(context);
    }
  }
}
