package behavioral.memento

class Originator {
  var state: String? = null

  fun saveStateToMemento(): Memento = Memento(state!!)

  fun getStateFromMemento(memento: Memento) {
    state = memento.state
  }
}