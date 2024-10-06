package behavioral.mediator

class ConcreteModel(mediator: Mediator, name: String) : Model(mediator, name) {
  override fun send(msg: String): String {
    mediator.sendMessage(msg, this)
    return "$name: Sending Message = $msg"
  }

  override fun receive(msg: String): String = "$name: Received Message = $msg"
}