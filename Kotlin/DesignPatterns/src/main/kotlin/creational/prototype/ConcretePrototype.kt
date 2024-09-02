package creational.prototype

data class ConcretePrototype(var state: String) : Prototype {

  override fun clone(): Prototype {
    return ConcretePrototype(state)
  }

  fun showState(): String {
    return "State: $state"
  }
}
