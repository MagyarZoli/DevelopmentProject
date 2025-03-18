from c import C
from g import G

class D(C, G):
  def function(self):
    print("d function")

  def return_function(self) -> str:
    return "d function"