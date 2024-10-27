package behavioral.observer

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainObserverTest {
  private lateinit var topic: Topic
  private lateinit var obj1: Observer
  private lateinit var obj2: Observer
  private lateinit var obj3: Observer

  @BeforeEach
  internal fun setUp() {
    topic = Topic()
    obj1 = TopicSubscriber("Subscriber1")
    obj2 = TopicSubscriber("Subscriber2")
    obj3 = TopicSubscriber("Subscriber3")
    topic.register(obj1)
    topic.register(obj2)
    topic.register(obj3)
  }

  @Test
  internal fun equalsTest() {
    assertThat(topic.postMessage("Hello Subscriber!")).isEqualTo("Message Posted to Topic: Hello Subscriber!")
  }
}