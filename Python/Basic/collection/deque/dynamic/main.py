from collections import deque

def print_string(deque1: deque):
  print(deque1)

def size(deque1: deque) -> int:
  return len(deque1)

def search_with_index(deque1: deque, index: int):
  return deque1[index]

def contains(deque1: deque, object1) -> bool:
  return deque1.__contains__(object1)

def equals(deque1: deque, deque2: deque) -> bool:
  # return deque1 == deque1
  return deque1.__eq__(deque2)

def reverse(deque1: deque) -> deque:
  # return deque1[::-1]
  return deque(deque1.__reversed__())

def count(deque1: deque, object1) -> int:
  return deque1.count(object1)

def create_empty() -> deque:
  return deque(())

def create(param1, param2, param3) -> deque:
  return deque((param1, param2, param3))

def append(deque1: deque, object1):
  deque1.append(object1)

def append_first(deque1: deque, object1):
  deque1.appendleft(object1)

def append_last(deque1: deque, object1):
  deque1.append(object1)

def append_with_index(deque1: deque, index: int, object1):
  deque1.insert(index, object1)

def append_all(deque1: deque, deque2: deque):
  deque1.extend(deque2)

def update_with_index(deque1: deque, index: int, object1):
  deque1[index] = object1

def remove(deque1: deque, object1):
  deque1.remove(object1)

def remove_first(deque1: deque):
  deque1.popleft()

def remove_last(deque1: deque):
  deque1.pop()

def remove_all(deque1: deque):
  deque1.clear()

deque1 = deque()
deque1.append(1)
deque1.append("string")
deque1.append(True)
deque2 = deque()
deque2.append(1)
deque2.append("string")
deque2.append(True)
deque3 = deque()
deque3.append("append3")
deque1.append("append4")

print_string(deque1)
print(size(deque1))
print(search_with_index(deque1, 1))
print(contains(deque1, "string"))
print(equals(deque1, deque2))

print(reverse(deque1))
print(count(deque1, "string"))

print(create_empty())
print(create(1, "string", True))
append(deque1, "append1")
append_with_index(deque1, 1, "append2")
append_first(deque1, "append5")
append_last(deque1, "append6")
append_all(deque1, deque3)
print(deque1)
update_with_index(deque1, 1, "update2")
print(deque1)
remove(deque1, "append3")
remove_first(deque1)
remove_last(deque1)
print(deque1)
remove_all(deque1)
print(deque1)