package structural.composite

fun main() {
  val leafA = Leaf.A("leafA", 100)
  val leafB = Leaf.B("leafB", 101, true)
  val composite = Composite()
  composite.addComponent(leafA)
  composite.addComponent(leafB)

  print(composite.show())
}