def print_string(dict1: dict):
  print(dict1)

def size(dict1: dict) -> int:
  return len(dict1)

def search(dict1: dict, key1):
  # return dict1[key1]
  return dict1.get(key1)

def contains_key(dict1: dict, object1) -> bool:
  return dict1.__contains__(object1)

def equals(dict1: dict, dict2: dict) -> bool:
  # return dict1 == dict2
  return dict1.__eq__(dict2)

def create_empty() -> dict:
  # return {}
  return dict(())

def create(key1, param1, key2, param2, key3, param3) -> dict:
  return {
    key1: param1,
    key2: param2,
    key3: param3
  }
  # return dict(
  #   keyword1=param1,
  #   keyword2=param2,
  #   keyword3=param3
  # )

def append(dict1: dict, key1, object1):
  # dict1[key1] = object1
  dict1.update({key1: object1})

def append_all(dict1: dict, dict2: dict):
  dict1.update(dict2)

def update(dict1: dict, key1, object1):
  # dict1[key1] = object1
  dict1.update({key1: object1})

def remove(dict1: dict, object1):
  dict1.pop(object1)

def remove_all(dict1: dict):
  dict1.clear()

dict1 = {
  1: 1,
  2: "string",
  "3s": True
}

print_string(dict1)
print(size(dict1))
print(search(dict1, "3s"))
print(contains_key(dict1, "3s"))
print(equals(dict1, {1: 1, 2: "string", "3s": True}))

print(create_empty())
print(create(False, 1, 5, "string", "6s", True))
append(dict1, 3.14, "append1")
append_all(dict1, {3.14: "append3", 3: "append4"})
print(dict1)
update(dict1, 3.14, "append5")
print(dict1)
remove(dict1, 3.14)
print(dict1)
remove_all(dict1)
print(dict1)