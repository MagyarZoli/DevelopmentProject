package behavioral.command

sealed class ConcreteCommand {
  data class A(private var receiver: Receiver) : Command {
    override fun execute(): String {
      return receiver.executeA()
    }
  }

  data class B(private var receiver: Receiver) : Command {
    override fun execute(): String {
      return receiver.executeB()
    }
  }
}
