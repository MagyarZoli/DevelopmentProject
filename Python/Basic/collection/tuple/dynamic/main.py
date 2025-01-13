def print_string(tuple1: tuple):
  print(tuple1)

def size(tuple1: tuple) -> int:
  return len(tuple1)

def search_with_index(tuple1: tuple, index: int):
  return tuple1[index]

def contains(tuple1: tuple, object1) -> bool:
  return tuple1.__contains__(object1)

def equals(tuple1: tuple, tuple2: tuple) -> bool:
  # return tuple1 == tuple2
  return tuple1.__eq__(tuple2)

def sub(tuple1: tuple, start: int, end: int) -> tuple:
  return tuple1[start:end]

def reverse(tuple1: tuple) -> tuple:
  return tuple1[::-1]

def count(tuple1: tuple, object1) -> int:
  return tuple1.count(object1)

def create_empty() -> tuple:
  # return ()
  return tuple(())

def create(param1, param2, param3) -> tuple:
  # return (param1, param2, param3)
  return tuple((param1, param2, param3))

tuple1 = (1, "string", True)

print_string(tuple1)
print(size(tuple1))
print(search_with_index(tuple1, 1))
print(contains(tuple1, "string"))
print(equals(tuple1, (1, "string", True)))

print(sub(tuple1, 1, 3))
print(reverse(tuple1))
print(count(tuple1, "string"))

print(create_empty())
print(create(1, "string", True))