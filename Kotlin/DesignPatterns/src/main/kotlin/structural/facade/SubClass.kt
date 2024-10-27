package structural.facade

sealed class SubClass {
  class A {
    fun doSomethingA(): String {
      return "SubClassA"
    }
  }

  class B {
    fun doSomethingB(): Int {
      return 100
    }
  }

  class C {
    fun doSomethingC(): Boolean {
      return true
    }
  }
}
