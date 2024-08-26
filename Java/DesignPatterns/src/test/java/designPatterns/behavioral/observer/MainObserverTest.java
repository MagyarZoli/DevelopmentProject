package designPatterns.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainObserverTest {
  private Topic topic;
  private Observer obj1;
  private Observer obj2;
  private Observer obj3;

  @BeforeEach
  void setUp() {
    topic = new Topic();
    obj1 = new TopicSubscriber("Subscriber1");
    obj2 = new TopicSubscriber("Subscriber2");
    obj3 = new TopicSubscriber("Subscriber3");
    topic.register(obj1);
    topic.register(obj2);
    topic.register(obj3);
  }

  @Test
  void equalsTest() {
    assertThat(topic.postMessage("Hello Subscribers!")).isEqualTo("Message Posted to Topic: Hello Subscribers!");
  }
}
