package designPatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
  private List<Model> models;

  public ConcreteMediator() {
    models = new ArrayList<>();
  }

  @Override
  public void sendMessage(String msg, Model model) {
   for (Model m : models) {
     if (m != model) m.receive(msg);
   }
  }

  @Override
  public boolean addModel(Model model) {
    return models.add(model);
  }
}
