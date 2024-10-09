package behavioral.observer

interface Subject {
  fun register(o: Observer)
  fun unregister(o: Observer)
  fun notifyObserver()
}