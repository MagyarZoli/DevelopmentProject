package behavioral.iterator

fun main() {
  var values = arrayOf("val1", "val2", "val3", "val4")
  var repository = Repository(values)
  var iter = repository.getIterator()

  while (iter.hasNext()) {
    println(iter.next())
  }
}