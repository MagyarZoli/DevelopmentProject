package structural.decorator

class ConcreteComponent : Component {
  override fun assemble(): String {
    return "Concrete Component"
  }
}