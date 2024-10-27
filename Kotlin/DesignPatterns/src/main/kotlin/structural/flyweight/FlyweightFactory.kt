package structural.flyweight

object FlyweightFactory {
  fun getConcreteFlyweight(value: String): Flyweight {
    return ConcreteFlyweight(value)
  }
}