from typing import TypeVar, Generic

T = TypeVar("T")

class A(Generic[T]):
  def function(self, object1: T):
    print(object1)

  def return_function(self, object1: T) -> T:
    return object1