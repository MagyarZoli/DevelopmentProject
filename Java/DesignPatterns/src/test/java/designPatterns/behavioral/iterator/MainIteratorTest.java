package designPatterns.behavioral.iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainIteratorTest {
  private String[] values;
  private Repository repository;
  private Iterator iter;

  @BeforeEach
  void setUp() {
    values = new String[] {"val1", "val2", "val3", "val4"};
    repository = new Repository(values);
    iter = repository.getIterator();
  }

  @Test
  void equalsTest() {
    int index = 0;
    while (iter.hasNext()) {
      assertThat(iter.next()).isEqualTo(values[index++]);
    }
  }
}
