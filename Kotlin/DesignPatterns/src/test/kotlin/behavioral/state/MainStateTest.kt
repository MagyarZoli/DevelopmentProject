package behavioral.state

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainStateTest {
  private lateinit var context: Context
  private lateinit var startState: ConcreteState.StartState
  private lateinit var stopState: ConcreteState.StopState

  @BeforeEach
  internal fun setUp() {
    context = Context()
    startState = ConcreteState.StartState()
    stopState = ConcreteState.StopState()
  }

  @Test
  internal fun equalsTest() {
    assertThat(startState.doAction(context)).isEqualTo("Player is in start state")
    assertThat(context.state.toString()).isEqualTo("StartState")
    assertThat(stopState.doAction(context)).isEqualTo("Player is in stop state")
    assertThat(context.state.toString()).isEqualTo("StopState")
  }
}