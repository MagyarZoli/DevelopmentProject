package behavioral.command

class Invoker {
  private var _command: Command? = null

  var command: Command?
    get() = _command
    set(value: Command?) {
      _command = value
    }

  fun invokeExecute(): String {
    return command!!.execute()
  }
}