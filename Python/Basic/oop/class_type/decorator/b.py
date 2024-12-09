from dataclasses import dataclass
from a import a

@a(value=200)
@dataclass
class B:
  field = "field"

  a = None
  b = None

  def __init__(self, a, b):
    self.a = a
    self.b = b
    annotation_value = self._annotated()
    self._reflection(annotation_value)

  def function(self):
    return self.a + self.b

  @staticmethod
  def static_function(a, b):
    return a - b

  def _reflection(self, value):
      setattr(self, 'a', value)

  def _annotated(self):
    return getattr(self, '_a_value', 0)