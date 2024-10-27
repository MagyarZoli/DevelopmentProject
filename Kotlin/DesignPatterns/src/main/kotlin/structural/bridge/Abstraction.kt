package structural.bridge

abstract class Abstraction(protected var implementor: Implementor) {
  abstract fun doSomething(): String
}