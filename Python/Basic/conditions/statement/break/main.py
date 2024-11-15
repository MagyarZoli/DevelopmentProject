x = 0
y = 5

def break_statement():
  global x
  while True:
    if x == y:
      break
    x += 1
    print(x)

break_statement()