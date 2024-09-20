package structural.flyweight

data class ConcreteFlyweight(private var value: String) : Flyweight {
  override fun doSomething(): String {
    return "ConcreteFlyweight: $value"
  }
}