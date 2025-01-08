def print_string(list1: list[int]):
  print(list1)

def size(list1: list[int]) -> int:
  return len(list1)

def search_with_index(list1: list[int], index: int):
  return list1[index]

def contains(list1: list[int], object1: int) -> bool:
  return list1.__contains__(object1)

def equals(list1: list[int], list2: list[int]) -> bool:
  # return list1 == list2
  return list1.__eq__(list2)

def sub(list1: list[int], start: int, end: int) -> list[int]:
  return list1[start:end]

def sort(list1: list[int]):
  list1.sort()

def reverse(list1: list[int]) -> list[int]:
  # return list1[::-1]
  return list(list1.__reversed__())

def count(list1: list[int], object1: int) -> int:
  return list1.count(object1)

def create_empty() -> list[int]:
  return list[int](())

def create(param1: int, param2: int, param3: int) -> list[int]:
  # return [param1, param2, param3]
  return list[int]((param1, param2, param3))

def append(list1: list[int], object1):
  list1.append(object1)

def append_with_index(list1: list[int], index: int, object1: int):
  list1.insert(index, object1)

def append_all(list1: list[int], list2: list[int]):
  # list1 += list2
  # list1 = [*list1, *list2]
  list1.extend(list2)

def update_with_index(list1: list[int], index: int, object1: int):
  list1[index] = object1

def remove(list1: list[int], object1: int):
  list1.remove(object1)

def remove_with_index(list1: list[int], index: int):
  list1.pop(index)

def remove_all(list1: list[int]):
  list1.clear()

list1 = [2, 3, 1, 4]

print_string(list1)
print(size(list1))
print(search_with_index(list1, 1))
print(contains(list1, 1))
print(equals(list1, [2, 3, 1, 4]))
print(sub(list1, 1, 3))

sort(list1)
print(list1)
print(reverse(list1))
print(count(list1, 3))

print(create_empty())
print(create(1, 2, 3))
append(list1, 11)
append_with_index(list1, 1, 22)
append_all(list1, [33, 44])
print(list1)
update_with_index(list1, 1, 222)
print(list1)
remove(list1, 33)
remove_with_index(list1, 1)
print(list1)
remove_all(list1)
print(list1)
