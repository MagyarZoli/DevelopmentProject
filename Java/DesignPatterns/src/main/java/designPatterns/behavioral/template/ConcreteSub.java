package designPatterns.behavioral.template;

public class ConcreteSub {
  static class A extends Super {
    @Override
    String initialize() {
      return "A initialized!";
    }

    @Override
    String startPlay() {
      return "A started.";
    }

    @Override
    String endPlay() {
      return "A finished!";
    }
  }

  static class B extends Super {
    @Override
    String initialize() {
      return "B initialized!";
    }

    @Override
    String startPlay() {
      return "B started.";
    }

    @Override
    String endPlay() {
      return "B finished!";
    }
  }
}
