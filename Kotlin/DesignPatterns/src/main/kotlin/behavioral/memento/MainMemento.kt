package behavioral.memento

fun main() {
  var originator = Originator()
  var careTaker = CareTaker()
  originator.state = "State #1"
  originator.state = "State #2"
  careTaker.add(originator.saveStateToMemento())
  originator.state = "State #3"
  careTaker.add(originator.saveStateToMemento())
  originator.state = "State #4"

  println("Current State: ${originator.state}")
  originator.getStateFromMemento(careTaker.get(0))
  println("First saved State: ${originator.state}")
  originator.getStateFromMemento(careTaker.get(1))
  println("Second saved State: ${originator.state}")
}