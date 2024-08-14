package designPatterns.structural.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainFacadeTest {
  private Facade facade;

  @BeforeEach
  void setUp() {
    facade = new Facade();
  }

  @Test
  void equalsTest() {
    assertThat(facade.start()).isEqualTo("SubClassA, 100, true");
  }
}
