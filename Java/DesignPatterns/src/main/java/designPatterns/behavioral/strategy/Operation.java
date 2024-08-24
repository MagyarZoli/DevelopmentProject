package designPatterns.behavioral.strategy;

public class Operation {
  static class Add implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
      return num1 + num2;
    }
  }

  static class Subtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
      return num1 - num2;
    }
  }

  static class Multiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
      return num1 * num2;
    }
  }
}
