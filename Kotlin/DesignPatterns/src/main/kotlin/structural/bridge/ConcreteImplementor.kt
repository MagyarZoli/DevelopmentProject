package structural.bridge

sealed class ConcreteImplementor {
  class A : Implementor {
    override fun applyImplementor(): String {
      return "Applying A"
    }
  }

  class B : Implementor {
    override fun applyImplementor(): String {
      return "Applying B"
    }
  }
}
