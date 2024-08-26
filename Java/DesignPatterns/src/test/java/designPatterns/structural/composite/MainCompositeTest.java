package designPatterns.structural.composite;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainCompositeTest {
  private Leaf.A leafA;
  private Leaf.B leafB;
  private Composite composite;

  @BeforeEach
  void setUp() {
    leafA = new Leaf.A("leafA", 100);
    leafB = new Leaf.B("leafB", 101, true);
    composite = new Composite();
    composite.addComponent(leafA);
    composite.addComponent(leafB);
  }

  @Test
  void equalsTest() {
    assertThat(composite.show()).isEqualTo("leafA, 100\nleafB, 101, true\n");
  }
}
