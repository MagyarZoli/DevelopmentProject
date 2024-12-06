from a import A

class B(A):
  def __init__(self, a, b):
    super().__init__(a, b)

  def function(self):
    return self.a * self.a

  @staticmethod
  def static_function(a, b):
    return b * b
