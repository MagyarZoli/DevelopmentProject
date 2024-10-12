package behavioral.state

interface State {
  fun doAction(context: Context): String
}