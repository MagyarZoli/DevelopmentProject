package structural.decorator

fun main() {
  val concreteCom: Component = ConcreteComponent()
  val decorateCom: Component = ConcreteDecorator(ConcreteComponent())

  println(concreteCom.assemble())
  println(decorateCom.assemble())
}