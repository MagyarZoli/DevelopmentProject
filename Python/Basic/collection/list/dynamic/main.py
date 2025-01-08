def print_string(list1: list):
  print(list1)

def size(list1: list) -> int:
  return len(list1)

def search_with_index(list1: list, index: int):
  return list1[index]

def contains(list1: list, object1) -> bool:
  return list1.__contains__(object1)

def equals(list1: list, list2: list) -> bool:
  # return list1 == list2
  return list1.__eq__(list2)

def sub(list1: list, start: int, end: int) -> list:
  return list1[start:end]

def reverse(list1: list) -> list:
  # return list1[::-1]
  return list(list1.__reversed__())

def count(list1: list, object1) -> int:
  return list1.count(object1)

def create_empty() -> list:
  # return []
  return list(())

def create(param1, param2, param3) -> list:
  # return [param1, param2, param3]
  return list((param1, param2, param3))

def append(list1: list, object1):
  list1.append(object1)

def append_with_index(list1: list, index: int, object1):
  list1.insert(index, object1)

def append_all(list1: list, list2: list):
  # list1 += list2
  # list1 = [*list1, *list2]
  list1.extend(list2)

def update_with_index(list1: list, index: int, object1):
  list1[index] = object1

def remove(list1: list, object1):
  list1.remove(object1)

def remove_with_index(list1: list, index: int):
  list1.pop(index)

def remove_all(list1: list):
  list1.clear()

list1 = [1, "string", True]

print_string(list1)
print(size(list1))
print(search_with_index(list1, 1))
print(contains(list1, "string"))
print(equals(list1, [1, "string", True]))

print(sub(list1, 1, 3))
print(reverse(list1))
print(count(list1, "string"))

print(create_empty())
print(create(1, "string", True))
append(list1, "append1")
append_with_index(list1, 1, "append2")
append_all(list1, ["append3", "append4"])
print(list1)
update_with_index(list1, 1, "update2")
print(list1)
remove(list1, "append3")
remove_with_index(list1, 1)
print(list1)
remove_all(list1)
print(list1)
