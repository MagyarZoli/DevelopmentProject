package designPatterns.behavioral.command;

public class MainCommand {
  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command commandA = new ConcreteCommand.A(receiver);
    Command commandB = new ConcreteCommand.B(receiver);
    Invoker invoker = new Invoker();

    invoker.setCommand(commandA);
    System.out.println(invoker.invokeExecute());

    invoker.setCommand(commandB);
    System.out.println(invoker.invokeExecute());
  }
}
