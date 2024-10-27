package behavioral.chain

abstract class Handler {
  protected var _next: Handler? = null

  var next: Handler?
    get() = _next
    set(next) {
      _next = next
    }

  abstract fun handleRequest(request: String): String?
}