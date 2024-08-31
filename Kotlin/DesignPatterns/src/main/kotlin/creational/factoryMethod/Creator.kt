package creational.factoryMethod

open abstract class Creator {
  abstract fun factoryMethod(): Product

  fun someOperation(): String {
    val product = factoryMethod()
    return product.use()
  }
}