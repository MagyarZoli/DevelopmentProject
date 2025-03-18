def print_string(*args1: int):
  print(args1)

def size(*args1: int) -> int:
  return len(args1)

def search_with_index(index: int, *args1: int):
  return args1[index]

def contains(object1: int, *args1: int) -> bool:
  return args1.__contains__(object1)

def sub(start: int, end: int, *args1: int):
  return args1[start:end]

def reverse(*args1: int):
  return args1[::-1]

def count(object1: int, *args1: int) -> int:
  return args1.count(object1)

def create(*param1: int):
  return param1

a = 2
b = 3
c = 1
d = 4

print_string(a, b, c, d)
print(size(a, b, c, d))
print(search_with_index(1, a, b, c, d))
print(contains(2, a, b, c, d))

print(sub(1, 3, a, b, c, d))
print(reverse(a, b, c, d))
print(count(3, a, b, c))

print(create(1, 2, 3, 4))
