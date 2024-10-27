package behavioral.mediator

fun main() {
  var mediator = ConcreteMediator()
  var m1 = ConcreteModel(mediator, "val1")
  var m2 = ConcreteModel(mediator, "val2")
  mediator.addModel(m1)
  mediator.addModel(m2)

  println(m1.send("Hello everyone!"))
  println(m2.receive("Hello"))
}