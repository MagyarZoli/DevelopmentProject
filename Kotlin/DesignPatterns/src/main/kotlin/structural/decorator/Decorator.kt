package structural.decorator

open class Decorator(protected var component: Component) : Component {
  override fun assemble(): String {
    return component.assemble()
  }
}