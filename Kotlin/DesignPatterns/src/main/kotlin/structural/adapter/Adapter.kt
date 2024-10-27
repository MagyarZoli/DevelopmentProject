package structural.adapter

data class Adapter(private var adaptee: Adaptee) : Target {
  override fun request(): String {
    return adaptee.specificRequest()
  }
}
