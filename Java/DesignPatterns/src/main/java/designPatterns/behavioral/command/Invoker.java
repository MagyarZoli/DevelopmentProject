package designPatterns.behavioral.command;

public class Invoker {
  private Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public String invokeExecute() {
    return command.execute();
  }
}
