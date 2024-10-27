package behavioral.chain

fun main() {
  var handlerA = ConcreteHandler.A()
  var handlerB = ConcreteHandler.B()
  handlerA.next = handlerB

  println(handlerA.handleRequest("one"))
  println(handlerA.handleRequest("two"))
}