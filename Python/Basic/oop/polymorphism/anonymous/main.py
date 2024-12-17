from a import A

def ab_function(a_class):
  a_class.a_function()
  # a_class.b_function()

B = type(
  "B",
  (A,),
  {
    "a_function": lambda self: {
      print("anonymous b method"),
      self.b_function(),
    },
    "b_function": lambda self: print("b method")
  }
)
ab_function(B())

C = type(
  "C",
  (A,),
  {
    "a_function": lambda self: print("anonymous c method"),
    "b_function": lambda self: print("c method")
  }
)
ab_function(C())