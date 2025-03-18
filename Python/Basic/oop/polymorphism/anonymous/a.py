from abc import ABC, abstractmethod

class A(ABC):
  a = None

  @abstractmethod
  def a_function(self): ...