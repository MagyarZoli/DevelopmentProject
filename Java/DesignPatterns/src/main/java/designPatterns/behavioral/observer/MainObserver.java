package designPatterns.behavioral.observer;

public class MainObserver {
  public static void main(String[] args) {
    Topic topic = new Topic();
    Observer obj1 = new TopicSubscriber("Subscriber1");
    Observer obj2 = new TopicSubscriber("Subscriber2");
    Observer obj3 = new TopicSubscriber("Subscriber3");
    topic.register(obj1);
    topic.register(obj2);
    topic.register(obj3);

    System.out.println(topic.postMessage("Hello Subscribers!"));
  }
}
