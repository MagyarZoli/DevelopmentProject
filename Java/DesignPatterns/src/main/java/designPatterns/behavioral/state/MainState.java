package designPatterns.behavioral.state;

public class MainState {
  public static void main(String[] args) {
    Context context = new Context();

    State startState = new ConcreteState.StartState();
    System.out.println(startState.doAction(context) + " : " + context.getState());

    State stopState = new ConcreteState.StopState();
    System.out.println(stopState.doAction(context) + " : " + context.getState());
  }
}
