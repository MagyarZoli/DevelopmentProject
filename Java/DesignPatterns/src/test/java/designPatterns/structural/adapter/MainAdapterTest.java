package designPatterns.structural.adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainAdapterTest {

  private Adaptee adaptee;
  private Target target;

  @BeforeEach
  void setUp() {
    adaptee = new Adaptee();
    target = new Adapter(adaptee);
  }

  @Test
  void equalsTest() {
    assertThat(target.request()).isEqualTo("Called specificRequest");
  }
}
