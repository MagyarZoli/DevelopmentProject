package designPatterns.behavioral.memento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainMementoTest {
  private Originator originator;
  private CareTaker careTaker;

  @BeforeEach
  void setUp() {
    originator = new Originator();
    careTaker = new CareTaker();
    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #3");
    careTaker.add(originator.saveStateToMemento());
    originator.setState("State #4");
  }

  @Test
  void equalsTest() {
    assertThat(originator.getState()).isEqualTo("State #4");

    originator.getStateFromMemento(careTaker.get(0));
    assertThat(originator.getState()).isEqualTo("State #2");

    originator.getStateFromMemento(careTaker.get(1));
    assertThat(originator.getState()).isEqualTo("State #3");
  }
}
