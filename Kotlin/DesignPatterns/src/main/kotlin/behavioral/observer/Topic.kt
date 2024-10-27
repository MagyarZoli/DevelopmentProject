package behavioral.observer

class Topic : Subject {
  private lateinit var observerList: MutableList<Observer>
  private var message: String? = null

  init {
    observerList = ArrayList()
  }

  override fun register(o: Observer) {
    observerList.add(o)
  }

  override fun unregister(o: Observer) {
    observerList.remove(o)
  }

  override fun notifyObserver() {
    for (o in observerList) {
      o.update(message!!)
    }
  }

  fun postMessage(msg: String): String {
    message = msg
    notifyObserver()
    return "Message Posted to Topic: $msg"
  }
}