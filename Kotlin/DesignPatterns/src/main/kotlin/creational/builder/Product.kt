package creational.builder

class Product {
  private var _part1: String? = null
  private var _part2: String? = null

  var part1: String?
    get() = _part1
    set(value) {
      _part1 = value
    }

  var part2: String?
    get() = _part2
    set(value) {
      _part2 = value
    }

  fun show(): String {
    return "Product with $_part1 and $_part2"
  }
}
