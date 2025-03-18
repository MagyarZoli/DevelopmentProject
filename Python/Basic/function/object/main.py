from a import A

def function(param1):
  print(param1)

def return_function(param1):
  return A(param1.field)

function(A("parameters"))
print(return_function(A("parameters")))