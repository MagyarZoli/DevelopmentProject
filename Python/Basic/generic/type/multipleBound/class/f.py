from abc import ABC, abstractmethod

class F(ABC):
  @abstractmethod
  def function(self): ...

  @abstractmethod
  def return_function(self) -> str: ...
  