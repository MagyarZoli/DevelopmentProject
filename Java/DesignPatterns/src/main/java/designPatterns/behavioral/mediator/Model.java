package designPatterns.behavioral.mediator;

public abstract class Model {
  protected Mediator mediator;
  protected String name;

  public Model(Mediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  public abstract String send(String msg);
  public abstract String receive(String msg);
}
