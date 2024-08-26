package designPatterns.behavioral.observer;

public class TopicSubscriber implements Observer {
  private String name;

  public TopicSubscriber(String name) {
    this.name = name;
  }

  @Override
  public String update(String message) {
    return name + ":: got message >> " + message;
  }
}
