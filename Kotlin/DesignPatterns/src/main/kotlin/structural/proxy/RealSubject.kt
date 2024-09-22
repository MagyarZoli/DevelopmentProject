package structural.proxy

data class RealSubject(private var value: String) : Subject {
  override fun display(): String {
    return "Displaying $value"
  }
}
