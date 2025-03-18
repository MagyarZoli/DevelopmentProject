x = 10

def for_loop():
  for i in range(0, x):
    print(i)
  # for i in range(0, x): print(i)

def custom_for_loop():
  for i in range(1, (x + 1), 3):
    print(i)

def reverse_for_loop():
  for i in range(x, (0 - 1), -1):
    print(i)

for_loop()
custom_for_loop()
reverse_for_loop()