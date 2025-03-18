from collections import deque

def print_string(deque1: deque[int]):
  print(deque1)

def size(deque1: deque[int]) -> int:
  return len(deque1)

def search_with_index(deque1: deque[int], index: int):
  return deque1[index]

def contains(deque1: deque[int], object1) -> bool:
  return deque1.__contains__(object1)

def equals(deque1: deque[int], deque2: deque[int]) -> bool:
  # return deque1 == deque1
  return deque1.__eq__(deque2)

def reverse(deque1: deque[int]) -> deque[int]:
  # return deque1[::-1]
  return deque(deque1.__reversed__())

def count(deque1: deque[int], object1) -> int:
  return deque1.count(object1)

def create_empty() -> deque[int]:
  return deque(())

def create(param1, param2, param3) -> deque[int]:
  return deque((param1, param2, param3))

def append(deque1: deque[int], object1):
  deque1.append(object1)

def append_first(deque1: deque[int], object1):
  deque1.appendleft(object1)

def append_last(deque1: deque[int], object1):
  deque1.append(object1)

def append_with_index(deque1: deque[int], index: int, object1):
  deque1.insert(index, object1)

def append_all(deque1: deque[int], deque2: deque[int]):
  deque1.extend(deque2)

def update_with_index(deque1: deque[int], index: int, object1):
  deque1[index] = object1

def remove(deque1: deque[int], object1):
  deque1.remove(object1)

def remove_first(deque1: deque[int]):
  deque1.popleft()

def remove_last(deque1: deque[int]):
  deque1.pop()

def remove_all(deque1: deque[int]):
  deque1.clear()

deque1 = deque()
deque1.append(2)
deque1.append(3)
deque1.append(1)
deque1.append(4)
deque2 = deque()
deque2.append(2)
deque2.append(3)
deque2.append(1)
deque2.append(4)
deque3 = deque()
deque3.append(33)
deque1.append(44)

print_string(deque1)
print(size(deque1))
print(search_with_index(deque1, 1))
print(contains(deque1, 3))
print(equals(deque1, deque2))

print(reverse(deque1))
print(count(deque1, 2))

print(create_empty())
print(create(1, 2, 3))
append(deque1, 11)
append_with_index(deque1, 1, 22)
append_first(deque1, 55)
append_last(deque1, 66)
append_all(deque1, deque3)
print(deque1)
update_with_index(deque1, 1, 222)
print(deque1)
remove(deque1, 33)
remove_first(deque1)
remove_last(deque1)
print(deque1)
remove_all(deque1)
print(deque1)