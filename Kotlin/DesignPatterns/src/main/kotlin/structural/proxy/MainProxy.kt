package structural.proxy

fun main() {
  var subject: Subject = Proxy("proxyValue");

  print(subject.display())
}