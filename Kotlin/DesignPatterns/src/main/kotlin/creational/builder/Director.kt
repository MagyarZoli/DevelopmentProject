package creational.builder

class Director(builder: Builder) {
  init {
    builder.builderPart1()
    builder.builderPart2()
  }
}
