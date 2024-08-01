package designPatterns.creational.singleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MainSingletonTest {
  private Singleton s1;
  private Singleton s2;

  @BeforeEach
  void setUp() {
    s1 = Singleton.getInstance();
    s2 = Singleton.getInstance();
  }

  @Test
  void equalsTest() {
    assertThat(s1).isEqualTo(s2);
    assertThat(s1.getDate()).isEqualTo(s2.getDate());
  }
}