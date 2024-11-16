x = 0
y = 5
z = 3

def continue_statement():
  global x
  while x < y:
    x += 1
    if x == z:
      continue
    print(x)

continue_statement()