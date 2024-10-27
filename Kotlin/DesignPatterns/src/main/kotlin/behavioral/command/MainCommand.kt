package behavioral.command

fun main() {
  var receiver: Receiver = Receiver();
  var commandA: Command = ConcreteCommand.A(receiver)
  var commandB: Command = ConcreteCommand.B(receiver)
  var invoker: Invoker = Invoker()

  invoker.command = commandA
  println(invoker.invokeExecute())

  invoker.command = commandB
  println(invoker.invokeExecute())
}