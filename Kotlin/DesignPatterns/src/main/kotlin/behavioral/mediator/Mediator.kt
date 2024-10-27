package behavioral.mediator

interface Mediator {
  fun sendMessage(msg: String, model: Model)
  fun addModel(model: Model): Boolean
}