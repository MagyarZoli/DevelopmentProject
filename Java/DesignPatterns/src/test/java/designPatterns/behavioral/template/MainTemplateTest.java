package designPatterns.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTemplateTest {
  private Super sup;

  @Test
  void equalsTest() {
    sup = new ConcreteSub.A();
    assertThat(sup.play()).isEqualTo("A initialized!\nA started.\nA finished!");

    sup = new ConcreteSub.B();
    assertThat(sup.play()).isEqualTo("B initialized!\nB started.\nB finished!");
  }
}
