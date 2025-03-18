from b import B
from g import G

class C(B, G):
  def function(self):
    print("c function")

  def return_function(self) -> str:
    return "c function"