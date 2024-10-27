package creational.builder

interface Builder {
  fun builderPart1()
  fun builderPart2()
  fun getResult(): Product
}