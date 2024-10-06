package behavioral.mediator

abstract class Model(protected var mediator: Mediator, protected var name: String) {
  abstract fun send(msg: String): String
  abstract fun receive(msg: String): String
}