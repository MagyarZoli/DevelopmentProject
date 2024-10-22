package behavioral.template

fun main() {
  var sup: Super = ConcreteSub.A()
  println(sup.play())

  sup = ConcreteSub.B()
  println(sup.play())
}