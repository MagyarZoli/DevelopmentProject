package behavioral.chain

sealed class ConcreteHandler {
  class A : Handler() {
    override fun handleRequest(request: String): String? {
      if (request.equals("one")) {
        return "ConcreteHandlerA";
      } else if (next != null) {
        return next!!.handleRequest(request)
      }
      return null;
    }
  }

  class B : Handler() {
    override fun handleRequest(request: String): String? {
      if (request.equals("two")) {
        return "ConcreteHandlerB";
      } else if (next != null) {
        return next!!.handleRequest(request);
      }
      return null;
    }
  }
}
