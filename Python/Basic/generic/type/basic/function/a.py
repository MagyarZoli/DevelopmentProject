from typing import TypeVar

T = TypeVar("T")

class A:
  def function(self, object1: T):
    print(object1)

  def return_function(self, object1: T) -> T:
    return object1