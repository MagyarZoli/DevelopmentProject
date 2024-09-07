package creational.singleton

import java.time.LocalDateTime

object Singleton {

  private var instance: Singleton? = null
  private var _date: LocalDateTime? = null

  val date: LocalDateTime?
    get() = _date

  fun getInstance(): Singleton? {
    instance =  if (instance == null) {
      _date = LocalDateTime.now()
      Singleton
    } else {
      instance
    }
    return instance
  }

  override fun equals(obj: Any?): Boolean {
    obj as Singleton
    if (_date == obj._date) {
      if (this === obj) return true
      if (javaClass == obj?.javaClass) return true
      if (instance == obj.instance) return true
    }
    return false
  }
}