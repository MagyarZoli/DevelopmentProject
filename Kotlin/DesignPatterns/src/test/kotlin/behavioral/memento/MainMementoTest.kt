package behavioral.memento

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainMementoTest {
  private lateinit var originator: Originator
  private lateinit var careTaker: CareTaker

  @BeforeEach
  internal fun setUp() {
    originator = Originator()
    careTaker = CareTaker()
    originator.state = "State #1"
    originator.state = "State #2"
    careTaker.add(originator.saveStateToMemento())
    originator.state = "State #3"
    careTaker.add(originator.saveStateToMemento())
    originator.state = "State #4"
  }

  @Test
  internal fun equalsTest() {
    assertThat(originator.state).isEqualTo("State #4")

    originator.getStateFromMemento(careTaker.get(0))
    assertThat(originator.state).isEqualTo("State #2")

    originator.getStateFromMemento(careTaker.get(1))
    assertThat(originator.state).isEqualTo("State #3")
  }
}