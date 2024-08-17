package designPatterns.behavioral.command;

public class ConcreteCommand {
  static class A implements Command {
    private Receiver receiver;

    public A(Receiver receiver) {
      this.receiver = receiver;
    }

    @Override
    public String execute() {
      return receiver.executeA();
    }
  }

  static class B implements Command {
    private Receiver receiver;

    public B(Receiver receiver) {
      this.receiver = receiver;
    }

    @Override
    public String execute() {
      return receiver.executeB();
    }
  }
}
