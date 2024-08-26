package designPatterns.behavioral.mediator;

public class ConcreteModel extends Model {
  public ConcreteModel(Mediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public String send(String msg) {
    mediator.sendMessage(msg, this);
    return name + ": Sending Message = " + msg;
  }

  @Override
  public String receive(String msg) {
    return name + ": Received Message = " + msg;
  }
}
