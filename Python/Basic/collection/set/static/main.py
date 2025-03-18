def print_string(set1: set[int]):
  print(set1)

def size(set1: set[int]) -> int:
  return len(set1)

def contains(set1: set[int], object1) -> bool:
  return set1.__contains__(object1)

def equals(set1: set[int], set2: set[int]) -> bool:
  # return set1 == set2
  return set1.__eq__(set2)

def union(set1: set[int], set2: set[int]) -> set[int]:
  # return set1 | set2
  return set1.union(set2)

def intersection(set1: set[int], set2: set[int]) -> set[int]:
  # return set1 & set2
  return set1.intersection(set2)

def difference(set1: set[int], set2: set[int]) -> set[int]:
  # return set1 - set2
  return set1.difference(set2)

def symmetric_difference(set1: set[int], set2: set[int]) -> set[int]:
  # return set1 ^ set2
  return set1.symmetric_difference(set2);

def create_empty() -> set[int]:
  return set[int](())

def create(param1, param2, param3) -> set[int]:
  # return [param1, param2, param3]
  return set[int]((param1, param2, param3))

def append(set1: set, object1):
  set1.add(object1)

def append_all(set1: set, set2: set):
  set1.update(set2)

def remove(set1: set, object1):
  # set1.remove(object1)
  set1.discard(object1)

def remove_all(set1: set):
  set1.clear()

set1 = {2, 3, 1, 4}

print_string(set1)
print(size(set1))
print(contains(set1, 2))
print(equals(set1, {2, 3, 1, 4}))

print(union(set1, {2, 3, 5}))
print(intersection(set1, {2, 3, 5}))
print(difference(set1, {2, 3, 5}))
print(symmetric_difference(set1, {2, 3, 5}))

print(create_empty())
print(create(1, 2, 3))
append(set1, 11)
append_all(set1, {33, 4})
print(set1)
remove(set1, 33)
print(set1)
remove_all(set1)
print(set1)