from a import A

class B(A):
  b = None

  def a_function(self):
    print("b override a function")

  def b_function(self):
    print("b function")