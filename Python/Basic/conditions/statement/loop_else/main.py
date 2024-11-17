x = 0
y = 5

def while_else_statement():
  global x
  while x < y:
    x += 1
    print(x)
  else:
    print("The condition no longer is True!")

def for_else_statement():
  for i in range(5):
    print(i)
  else:
    print("The condition out of range!")

while_else_statement()
for_else_statement()
