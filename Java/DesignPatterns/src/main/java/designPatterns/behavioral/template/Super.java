package designPatterns.behavioral.template;

public abstract class Super {
  abstract String initialize();
  abstract String startPlay();
  abstract String endPlay();

  public final String play() {
    return initialize() + "\n" + startPlay() + "\n" + endPlay();
  }
}
