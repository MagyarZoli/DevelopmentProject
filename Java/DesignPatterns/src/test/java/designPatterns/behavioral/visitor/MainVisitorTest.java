package designPatterns.behavioral.visitor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainVisitorTest {
  private Part part;

  @Test
  void equalsTest() {
    part = new ConcretePart.A();
    assertThat(part.accept(new DisplayVisitor())).isEqualTo("Displaying A");

    part = new ConcretePart.B();
    assertThat(part.accept(new DisplayVisitor())).isEqualTo("Displaying B");

    part = new ConcretePart.C();
    assertThat(part.accept(new DisplayVisitor())).isEqualTo("Displaying C");
  }
}
