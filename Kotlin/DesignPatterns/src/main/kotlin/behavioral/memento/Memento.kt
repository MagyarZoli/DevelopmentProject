package behavioral.memento

data class Memento(private var _state: String) {
  var state: String? = null
    get() = _state
}