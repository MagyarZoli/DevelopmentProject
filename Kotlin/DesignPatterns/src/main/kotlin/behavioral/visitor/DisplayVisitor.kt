package behavioral.visitor

class DisplayVisitor : Visitor {
  override fun visit(a: ConcretePart.A): String = "Displaying A"
  override fun visit(b: ConcretePart.B): String = "Displaying B"
  override fun visit(c: ConcretePart.C): String = "Displaying C"
}