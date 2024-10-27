package behavioral.memento

class CareTaker {
  private var mementoList: MutableList<Memento> = ArrayList()

  fun add(state: Memento) = mementoList.add(state)

  fun get(index: Int): Memento = mementoList[index]
}