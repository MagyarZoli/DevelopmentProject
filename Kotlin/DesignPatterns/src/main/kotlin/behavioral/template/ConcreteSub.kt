package behavioral.template

sealed class ConcreteSub {
  class A : Super() {
    override fun initialize(): String = "A initialized!"
    override fun startPlay(): String = "A started."
    override fun endPlay(): String = "A finished!"
  }

  class B : Super() {
    override fun initialize(): String = "B initialized!"
    override fun startPlay(): String = "B started."
    override fun endPlay(): String = "B finished!"
  }
}
