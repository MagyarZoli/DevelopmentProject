package behavioral.state

fun main() {
  var context = Context()

  var startState = ConcreteState.StartState()
  println("${startState.doAction(context)} : ${context.state}")

  var stopState = ConcreteState.StopState()
  println("${stopState.doAction(context)} : ${context.state}")
}