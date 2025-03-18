def print_string(dict1: dict[str, int]):
  print(dict1)

def size(dict1: dict[str, int]) -> int:
  return len(dict1)

def search(dict1: dict[str, int], key1: str) -> int:
  # return dict1[key1]
  return dict1.get(key1)

def contains_key(dict1: dict[str, int], object1: str) -> bool:
  return dict1.__contains__(object1)

def equals(dict1: dict[str, int], dict2: dict[str, int]) -> bool:
  # return dict1 == dict2
  return dict1.__eq__(dict2)

def create_empty() -> dict[str, int]:
  # return {}
  return dict[str, int](())

def create(key1: str, param1: int, key2: str, param2: int, key3: str, param3: int) -> dict[str, int]:
  return {
    key1: param1,
    key2: param2,
    key3: param3
  }
  # return dict[str, int](
  #   keyword1=param1,
  #   keyword2=param2,
  #   keyword3=param3
  # )

def append(dict1: dict[str, int], key1: str, object1: int):
  # dict1[key1] = object1
  dict1.update({key1: object1})

def append_all(dict1: dict[str, int], dict2: dict[str, int]):
  dict1.update(dict2)

def update(dict1: dict[str, int], key1: str, object1: int):
  # dict1[key1] = object1
  dict1.update({key1: object1})

def remove(dict1: dict[str, int], object1: str):
  dict1.pop(object1)

def remove_all(dict1: dict[str, int]):
  dict1.clear()

dict1 = {
  "2s": 2,
  "3s": 3,
  "4s": 1,
  "1s": 4
}

print_string(dict1)
print(size(dict1))
print(search(dict1, "2s"))
print(contains_key(dict1, "2s"))
print(equals(dict1, {"2s": 2, "3s": 3, "4s": 1, "1s": 4}))

print(create_empty())
print(create("1s", 1, "2s", 2, "3s", 3))
append(dict1, "5s", 11)
append_all(dict1, {"3s": 33, "6s": 44})
print(dict1)
update(dict1, "3s", 55)
print(dict1)
remove(dict1, "3s")
print(dict1)
remove_all(dict1)
print(dict1)