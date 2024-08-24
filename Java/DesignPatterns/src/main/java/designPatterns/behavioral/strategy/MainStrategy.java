package designPatterns.behavioral.strategy;

public class MainStrategy {
  public static void main(String[] args) {
    Context context = new Context(new Operation.Add());
    System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

    context = new Context(new Operation.Subtract());
    System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

    context = new Context(new Operation.Multiply());
    System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
  }
}
