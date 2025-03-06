from typing import TypeVar
from c import C

T = TypeVar("T", bound=C)

class A:
  def generic_function(self, object1: T):
    object1.function()

  def generic_return_function(self, object1: T) -> str:
    return object1.return_function()