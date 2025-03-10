from typing import TypeVar, Generic

T = TypeVar("T")

class A(Generic[T]):
  def generic_function(self, object1: T):
    object1.function()

  def generic_return_function(self, object1: T) -> str:
    return object1.return_function()