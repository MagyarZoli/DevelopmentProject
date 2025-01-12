from array import array

def print_string(array1: array):
  print(array1)

def size(array1: array) -> int:
  return len(array1)

def search_with_index(array1: array, index: int):
  return array1[index]

def contains(array1: array, object1) -> bool:
  return array1.__contains__(object1)

def equals(array1: array, array2: array) -> bool:
  # return array1 == array2
  return array1.__eq__(array2)

def sub(array1: array, start: int, end: int) -> array:
  return array1[start:end]

def reverse(array1: array) -> array:
  # return array1[::-1]
  array1.reverse()
  return array1

def count(array1: array, object1) -> int:
  return array1.count(object1)

def create_empty(type_code: str) -> array:
  return array(type_code, [])

def create(type_code: str, param1, param2, param3) -> array:
  return array(type_code, [param1, param2, param3])

def append(array1: array, object1):
  array1.append(object1)

def append_with_index(array1: array, index: int, object1):
  array1.insert(index, object1)

def append_all(array1: array, array2: array):
  # array1 += array2
  array1.extend(array2)

def update_with_index(array1: array, index: int, object1):
  array1[index] = object1

def remove(array1: array, object1):
  array1.remove(object1)

def remove_with_index(array1: array, index: int):
  array1.pop(index)

def remove_all(array1: array):
  #array1.clear() #3.13
  pass

array1 = array('I', [1, 2, 3, 4])

print_string(array1)
print(size(array1))
print(search_with_index(array1, 1))
print(contains(array1, 4))
print(equals(array1, array("I", [1, 2, 3, 4])))

print(sub(array1, 1, 3))
print(reverse(array1))
print(count(array1, 2))

print(create_empty("I"))
print(create("I", 1, 3, 2))
append(array1, 11)
append_with_index(array1, 1, 22)
append_all(array1, array("I", [33, 44]))
print(array1)
update_with_index(array1, 1, 111)
print(array1)
remove(array1, 3)
remove_with_index(array1, 1)
print(array1)
remove_all(array1)
print(array1)
