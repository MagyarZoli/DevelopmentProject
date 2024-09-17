package structural.facade

class Facade {
  private var subClassA: SubClass.A? = null
  private var subClassB: SubClass.B? = null
  private var subClassC: SubClass.C? = null

  init {
    subClassA = SubClass.A()
    subClassB = SubClass.B()
    subClassC = SubClass.C()
  }

  fun start(): String {
    return "${subClassA?.doSomethingA()}, ${subClassB?.doSomethingB()}, ${subClassC?.doSomethingC()}"
  }
}