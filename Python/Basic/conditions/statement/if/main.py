x = 5
y = 6

def if_statement():
  if x == y:
    print("x == y")
  print("x, y")

def else_statement():
  if x == y:
    print("x == y")
  else:
    print("x != y")
  print("x, y")

def elif_statement():
  if (x == y):
    print("x == y")
  elif (x < y):
    print("x < y")
  else:
    print("x > y")
  # if (x == y): print("x == y")
  # elif (x < y): print("x < y")
  # else: print("x > y")
  print("x, y")

if_statement()
else_statement()
elif_statement()
