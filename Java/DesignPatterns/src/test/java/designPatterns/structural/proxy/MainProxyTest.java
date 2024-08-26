package designPatterns.structural.proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainProxyTest {
  private Subject subject;

  @BeforeEach
  void setUp() {
    subject = new Proxy("proxyValue");
  }

  @Test
  void equalsTest() {
    assertThat(subject.display()).isEqualTo("Displaying proxyValue");
  }
}
