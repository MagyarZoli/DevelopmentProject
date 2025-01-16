def print_string(*args1):
  print(args1)

def size(*args1) -> int:
  return len(args1)

def search_with_index(index: int, *args1):
  return args1[index]

def contains(object1, *args1) -> bool:
  return args1.__contains__(object1)

def sub(start: int, end: int, *args1):
  return args1[start:end]

def reverse(*args1):
  return args1[::-1]

def count(object1, *args1) -> int:
  return args1.count(object1)

def create(*param1):
  return param1

a = 1
b = "string"
c = True

print_string(a, b, c)
print(size(a, b, c))
print(search_with_index(1, a, b, c))
print(contains("string", a, b, c))

print(sub(1, 3, a, b, c))
print(reverse(a, b, c))
print(count("string", a, b, c))

print(create(1, "string", True))
