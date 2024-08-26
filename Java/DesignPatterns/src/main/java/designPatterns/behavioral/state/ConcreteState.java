package designPatterns.behavioral.state;

public class ConcreteState {
  static class StartState implements State {
    @Override
    public String doAction(Context context) {
      context.setState(this);
      return "Player is in start state";
    }

    @Override
    public String toString() {
      return "StartState";
    }
  }

  static class StopState implements State {
    @Override
    public String doAction(Context context) {
      context.setState(this);
      return "Player is in stop state";
    }

    @Override
    public String toString() {
      return "StopState";
    }
  }
}
