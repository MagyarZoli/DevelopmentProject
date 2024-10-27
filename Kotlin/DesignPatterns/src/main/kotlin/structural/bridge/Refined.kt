package structural.bridge

class Refined constructor(implementor: Implementor) : Abstraction(implementor) {
  override fun doSomething(): String {
    return "Refined: ${implementor.applyImplementor()}"
  }
}