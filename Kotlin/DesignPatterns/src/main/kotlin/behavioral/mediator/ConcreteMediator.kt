package behavioral.mediator

class ConcreteMediator : Mediator {
  private var models: MutableList<Model>

  init {
    models = ArrayList()
  }

  override fun sendMessage(msg: String, model: Model) {
    for (m in models) {
      if (m != model) {
        m.receive(msg)
      }
    }
  }

  override fun addModel(model: Model): Boolean = models.add(model)
}