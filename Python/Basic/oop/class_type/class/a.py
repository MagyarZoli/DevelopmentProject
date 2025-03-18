class A:
  field = "field"

  a = None
  b = None

  def __init__(self, a, b):
    self.a = a
    self.b = b

  def function(self):
    return self.a + self.b

  @staticmethod
  def static_function(a, b):
    return a - b
