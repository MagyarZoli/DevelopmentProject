package creational.singleton

fun main() {
  val s1: Singleton? = Singleton.getInstance()
  val s2: Singleton? = Singleton.getInstance()

  print(s1?.equals(s2))
}