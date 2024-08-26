package designPatterns.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainStrategyTest {
  private Context context;

  @Test
  void equalsTest() {
    context = new Context(new Operation.Add());
    assertThat(context.executeStrategy(10, 5)).isEqualTo(10 + 5);

    context = new Context(new Operation.Subtract());
    assertThat(context.executeStrategy(10, 5)).isEqualTo(10 - 5);

    context = new Context(new Operation.Multiply());
    assertThat(context.executeStrategy(10, 5)).isEqualTo(10 * 5);
  }
}
