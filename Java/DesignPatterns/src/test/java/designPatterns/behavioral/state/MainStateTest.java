package designPatterns.behavioral.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainStateTest {
  private Context context;
  private State startState;
  private State stopState;

  @BeforeEach
  void setUp() {
    context = new Context();
    startState = new ConcreteState.StartState();
    stopState = new ConcreteState.StopState();
  }

  @Test
  void equalsTest() {
    assertThat(startState.doAction(context)).isEqualTo("Player is in start state");
    assertThat(context.getState().toString()).isEqualTo("StartState");
    assertThat(stopState.doAction(context)).isEqualTo("Player is in stop state");
    assertThat(context.getState().toString()).isEqualTo("StopState");
  }
}
