package designPatterns.behavioral.chain;

public class ConcreteHandler {
  static class A extends Handler {
    @Override
    public String handleRequest(String request) {
      if (request.equals("one")) {
        return "ConcreteHandlerA";
      } else if (next != null) {
        return next.handleRequest(request);
      }
      return null;
    }
  }

  static class B extends Handler {
    @Override
    public String handleRequest(String request) {
      if (request.equals("two")) {
        return "ConcreteHandlerB";
      } else if (next != null) {
        return next.handleRequest(request);
      }
      return null;
    }
  }
}
