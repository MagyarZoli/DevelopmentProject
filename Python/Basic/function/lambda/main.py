def function(lambda1, param1, param2):
  print(lambda1(param1, param2))

def return_function(lambda1, param1, param2):
  return lambda1(param1, param2)

if __name__ == '__main__':
  function(lambda a, b: a + b, 2, 3)
  function(lambda a, b: a * b, 2, 3)
  print(return_function(lambda a, b: a + b, 2, 3))
  print(return_function(lambda a, b: a + b, 2, 3))