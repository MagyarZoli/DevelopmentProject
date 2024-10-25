package behavioral.visitor

sealed class ConcretePart {
  class A : Part {
    override fun accept(visitor: Visitor): String = visitor.visit(this)
  }

  class B : Part {
    override fun accept(visitor: Visitor): String = visitor.visit(this)
  }

  class C : Part {
    override fun accept(visitor: Visitor): String = visitor.visit(this)
  }
}
