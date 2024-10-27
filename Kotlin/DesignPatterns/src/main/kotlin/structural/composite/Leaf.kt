package structural.composite

sealed class Leaf {
  data class A(private var value1: String, private var value2: Int) : Component {
    override fun show(): String {
      return "$value1, $value2"
    }
  }

  data class B(private var value1: String, private var value2: Int, private var value3: Boolean) : Component {
    override fun show(): String {
      return "$value1, $value2, $value3"
    }
  }
}
