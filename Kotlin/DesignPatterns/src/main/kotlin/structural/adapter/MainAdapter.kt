package structural.adapter

fun main() {
  var adaptee = Adaptee()
  var target = Adapter(adaptee)

  print(target.request())
}