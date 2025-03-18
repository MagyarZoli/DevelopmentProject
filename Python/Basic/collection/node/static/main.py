from a import A

def print_string(node1: A):
  print(node1)

def size(node1: A) -> int:
  return node1.size()

def search_with_index(node1: A, index: int):
  return node1.peek(index)

def search(node1: A, object1: int) -> int:
  return node1.search(object1)

def contains(node1: A, object1: int) -> bool:
  return node1.__contains__(object1)

def equals(node1: A, node2: A) -> bool:
  # return node1 == node2
  return node1.__eq__(node2)

def count(node1: A, object: int) -> int:
  return node1.count(object)

def reverse(node1: A) -> A:
  return node1.__reversed__()

def create_empty() -> A:
  # return []
  return A()

def create(param1: int, param2: int, param3: int) -> A:
  node1 = A()
  node1.add(param1)
  node1.add(param2)
  node1.add(param3)
  return node1

def append(node1: A, object1: int):
  node1.add(object1)

def append_with_index(node1: A, index: int, object1: int):
  node1.insert(index, object1)

def append_first(node1: A, object1: int):
  node1.insert(0, object1)

def append_last(node1: A, object1: int):
  node1.add(object1)

def append_all(node1: A, node2: A):
  node1.add_all(*node2.to_list())

def update_with_index(node1: A, index: int, object1: int):
  node1.modify(index, object1)

def remove(node1: A, object1: int):
  node1.remove(object1)

def remove_with_index(node1: A, index: int):
  node1.pop(index)

def remove_first(node1: A):
  node1.pop_first()

def remove_last(node1: A):
  node1.pop_last()

def remove_all(node1: A):
  node1.clear()

node1 = A()
node1.add(2)
node1.add(3)
node1.add(1)
node1.add(4)
node2 = A()
node2.add(2)
node2.add(3)
node2.add(1)
node2.add(4)
node3 = A()
node3.add(33)
node3.add(44)

print_string(node1)
print(size(node1))
print(search_with_index(node1, 1))
print(search(node1, 2))
print(contains(node1, 2))
print(equals(node1, node2))
print(count(node1, 2))

print(create_empty())
print(create(1, 2, 3))
append(node1, 11)
append_with_index(node1, 1, 22)
append_first(node1, 55)
append_last(node1, 66)
append_all(node1, node3)
print(node1)
update_with_index(node1, 1, 222)
print(node1.graph())
print(node1)
remove(node1, 33)
remove_with_index(node1, 1)
remove_first(node1)
remove_last(node1)
print(node1.graph())
print(node1)
remove_all(node1)
print(node1.graph())
print(node1)
