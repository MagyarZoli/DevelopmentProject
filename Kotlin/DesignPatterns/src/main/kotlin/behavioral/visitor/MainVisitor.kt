package behavioral.visitor

fun main() {
  var part: Part = ConcretePart.A()
  println(part.accept(DisplayVisitor()))

  part = ConcretePart.B()
  println(part.accept(DisplayVisitor()))

  part = ConcretePart.C()
  println(part.accept(DisplayVisitor()))
}