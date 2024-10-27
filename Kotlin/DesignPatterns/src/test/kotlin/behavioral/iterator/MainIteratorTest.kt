package behavioral.iterator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MainIteratorTest {
  private lateinit var values: Array<String>
  private lateinit var repository: Repository
  private lateinit var iter: Iterator

  @BeforeEach
  internal fun setUp() {
    values = arrayOf("val1", "val2", "val3", "val4")
    repository = Repository(values)
    iter = repository.getIterator()
  }

  @Test
  internal fun equalsTest() {
    var index = 0
    while (iter.hasNext()) {
      assertThat(iter.next()).isEqualTo(values[index++])
    }
  }
}