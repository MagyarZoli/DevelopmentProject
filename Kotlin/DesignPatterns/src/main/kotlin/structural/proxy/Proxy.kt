package structural.proxy

data class Proxy(private var value: String) : Subject {
  private var realSubject: RealSubject? = null

  override fun display(): String {
    if (realSubject == null) {
      realSubject = RealSubject(value)
    }
    return realSubject!!.display()
  }
}