package behavioral.state

sealed class ConcreteState {
  class StartState : State {
    override fun doAction(context: Context): String {
      context.state = this
      return "Player is in start state"
    }

    override fun toString(): String = "StartState"
  }

  class StopState : State {
    override fun doAction(context: Context): String {
      context.state = this
      return "Player is in stop state"
    }

    override fun toString(): String = "StopState"
  }
}
