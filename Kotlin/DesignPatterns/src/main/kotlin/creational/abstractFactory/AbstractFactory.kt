package creational.abstractFactory

interface AbstractFactory {
  fun createProductA(): AbstractProduct.A
  fun createProductB(): AbstractProduct.B
}