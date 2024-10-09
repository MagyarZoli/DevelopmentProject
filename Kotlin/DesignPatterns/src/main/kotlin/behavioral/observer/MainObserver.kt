package behavioral.observer

fun main() {
  var topic = Topic()
  var obj1 = TopicSubscriber("Subscriber1")
  var obj2 = TopicSubscriber("Subscriber2")
  var obj3 = TopicSubscriber("Subscriber3")
  topic.register(obj1)
  topic.register(obj2)
  topic.register(obj3)

  println(topic.postMessage("Hello Subscribers!"))
}