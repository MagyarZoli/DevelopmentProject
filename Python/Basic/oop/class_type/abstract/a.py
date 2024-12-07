from abc import ABC, abstractmethod

class A(ABC):
  field = "field"

  a = None
  b = None

  def __init__(self, a, b):
    self.a = a
    self.b = b

  @abstractmethod
  def abstract_function(self): ...

  def function(self):
    return self.a + self.b

  @staticmethod
  def static_function(a, b):
    return a - b