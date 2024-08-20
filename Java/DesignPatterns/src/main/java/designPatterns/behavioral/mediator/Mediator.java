package designPatterns.behavioral.mediator;

public interface Mediator {
  void sendMessage(String msg, Model model);
  boolean addModel(Model model);
}
