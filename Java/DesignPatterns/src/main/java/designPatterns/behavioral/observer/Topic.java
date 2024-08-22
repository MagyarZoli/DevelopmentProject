package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
  private List<Observer> observerList;
  private String message;

  public Topic() {
    observerList = new ArrayList<>();
  }

  @Override
  public void register(Observer o) {
    observerList.add(o);
  }

  @Override
  public void unregister(Observer o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o: observerList) {
      o.update(message);
    }
  }

  public String postMessage(String msg) {
    message = msg;
    notifyObservers();
    return "Message Posted to Topic: " + msg;
  }
}
