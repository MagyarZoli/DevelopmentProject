def function(param1="..."):
  print(param1)

def return_function(param1="..."):
  return param1

function()
function("parameters")
function(3)

print(return_function())
print(return_function("parameters"))
print(return_function(3))