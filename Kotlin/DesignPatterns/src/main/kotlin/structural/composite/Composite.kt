package structural.composite

class Composite : Component {
  private var components: MutableList<Component> = mutableListOf<Component>()

  fun addComponent(component: Component) {
    components.add(component)
  }

  fun removeComponent(component: Component) {
    components.remove(component)
  }

  override fun show(): String {
    val stringBuilder: StringBuilder = java.lang.StringBuilder()
    for (component in components) {
      stringBuilder.append(component.show()).append("\n")
    }
    return stringBuilder.toString()
  }
}