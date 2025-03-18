from typing import TypeVar, Generic, Union
from c import C
from g import G

# class CG(C, G):
#   pass

# T = TypeVar("T", bound=CG)
# T = TypeVar("T", bound=Union[C, G])
T = TypeVar("T", C, G, covariant=True)

class A(Generic[T]):
  def generic_function(self, object1: T):
    object1.function()

  def generic_return_function(self, object1: T) -> str:
    return object1.return_function()
