package creational.abstractFactory

sealed interface AbstractProduct {
  interface A {
    fun displayA(): String
  }

  interface B {
    fun displayB(): String
  }
}