package behavioral.visitor

interface Visitor {
  fun visit(a: ConcretePart.A): String
  fun visit(b: ConcretePart.B): String
  fun visit(c: ConcretePart.C): String
}