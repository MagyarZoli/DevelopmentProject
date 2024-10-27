package behavioral.template

abstract class Super {
  abstract fun initialize(): String
  abstract fun startPlay(): String
  abstract fun endPlay(): String

  fun play(): String = "${initialize()}\n${startPlay()}\n${endPlay()}"
}