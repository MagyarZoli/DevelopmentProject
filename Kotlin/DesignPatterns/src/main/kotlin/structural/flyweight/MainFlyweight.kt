package structural.flyweight

fun main() {
  var concreteFly: ConcreteFlyweight = FlyweightFactory.getConcreteFlyweight("value") as ConcreteFlyweight

  print(concreteFly.doSomething())
}