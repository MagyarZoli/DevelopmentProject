package behavioral.iterator

data class Repository(private var values: Array<String>) : Container {

  override fun getIterator(): Iterator = ValueIterator(values)

  private data class ValueIterator(private var values: Array<String>) : Iterator {
    private var index: Int = 0

    override fun hasNext(): Boolean = index < values.size

    override fun next(): Any? = if(this.hasNext()) values[index++] else null
  }
}