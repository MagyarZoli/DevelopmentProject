package behavioral.visitor

interface Part {
  fun accept(visitor: Visitor): String
}