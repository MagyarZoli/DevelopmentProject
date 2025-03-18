def print_string(set1: set):
  print(set1)

def size(set1: set) -> int:
  return len(set1)

def contains(set1: set, object1) -> bool:
  return set1.__contains__(object1)

def equals(set1: set, set2: set) -> bool:
  # return set1 == set2
  return set1.__eq__(set2)

def union(set1: set, set2: set) -> set:
  # return set1 | set2
  return set1.union(set2)

def intersection(set1: set, set2: set) -> set:
  # return set1 & set2
  return set1.intersection(set2)

def difference(set1: set, set2: set) -> set:
  # return set1 - set2
  return set1.difference(set2)

def symmetric_difference(set1: set, set2: set) -> set:
  # return set1 ^ set2
  return set1.symmetric_difference(set2)

def create_empty() -> set:
  return set(())

def create(param1, param2, param3) -> set:
  return {param1, param2, param3}
  # return set((param1, param2, param3))

def append(set1: set, object1):
  set1.add(object1)

def append_all(set1: set, set2: set):
  set1.update(set2)

def remove(set1: set, object1):
  # set1.remove(object1)
  set1.discard(object1)

def remove_all(set1: set):
  set1.clear()

set1 = {1, "string", True}

print_string(set1)
print(size(set1))
print(contains(set1, "string"))
print(equals(set1, {1, "string", True}))

print(union(set1, {2, "string", False}))
print(intersection(set1, {2, "string", False}))
print(difference(set1, {2, "string", False}))
print(symmetric_difference(set1, {2, "string", False}))

print(create_empty())
print(create(1, "string", True))
append(set1, "append1")
append_all(set1, {"append3", "append4"})
print(set1)
remove(set1, "append3")
print(set1)
remove_all(set1)
print(set1)