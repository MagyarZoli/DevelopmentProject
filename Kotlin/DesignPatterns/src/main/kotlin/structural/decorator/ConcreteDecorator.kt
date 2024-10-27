package structural.decorator

class ConcreteDecorator constructor(component: Component) : Decorator(component) {
  override fun assemble(): String {
    return "${super.assemble()}\nAdding Decorator"
  }
}