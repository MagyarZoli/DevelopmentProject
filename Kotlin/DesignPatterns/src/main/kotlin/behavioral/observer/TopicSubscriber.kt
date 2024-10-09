package behavioral.observer

class TopicSubscriber(private var name: String) : Observer {
  override fun update(message: String): String = "$name :: got message >> $message"
}