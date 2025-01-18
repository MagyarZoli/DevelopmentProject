class A:
  data: int = None
  next = None

  def __init__(self, data: int = None, next=None) -> None:
    self.data = data
    self.next = next

  def __str__(self) -> str:
    result = "A{"
    current = self
    size = self.size()
    for i in range(size):
      if current.data is not None:
        result += current.data.__str__()
      if i != size - 1:
        result += ", "
      current = current.next
    return result + "}"

  def graph(self) -> str:
    result = ""
    current = self
    size = self.size()
    for i in range(size):
      if current.data is not None:
        result += "(d,"
      else:
        result += "(x,"
      if i != size - 1:
        result += "n)-"
      else:
        result += "x)"
      current = current.next
    return result

  def __eq__(self, other: int) -> bool:
    if self is other:
      return True
    if other is None or type(self) is not type(other):
      return False
    if not self.data.__eq__(other.data):
      return False
    return self.next.__eq__(other.next)

  def size(self) -> int:
    count = 0
    current = self
    while current is not None:
      count += 1
      current = current.next
    return count

  def is_empty(self) -> bool:
    return self.data is None and self.next is None

  def __contains__(self, item) -> bool:
    current = self
    while current is not None:
      if (current.data is None and item is None) or (current.data is not None and current.data.__eq__(item)):
        return True
      current = current.next
    return False

  def to_list(self) -> list:
    list1 = []
    current = self
    while current is not None:
      list1.append(current.data)
      current = current.next
    return list1

  def add(self, object1: int) -> bool:
    current = self
    if current.data is None and current.next is None:
      current.data = object1
    else:
      while current.next is not None:
        current = current.next
      current.next = A(object1)
    return True

  def remove(self, object1: int) -> bool:
    current = self
    previous = None
    while current is not None:
      if (current.data is None and object1 is None) or (current.data is not None and current.data.__eq__(object1)):
        if previous is None:
          if current.next is not None:
            current.data = current.next.data
            current.next = current.next.next
          else:
            current.data = None
        else:
          previous.next = current.next
        return True
      previous = current
      current = current.next
    return False

  def contains_all(self, *collection1) -> bool:
    for e in collection1:
      if not self.__contains__(e):
        return False
    return True

  def add_all(self, *collection1) -> bool:
    modified = False
    for e in collection1:
      if self.add(e):
        modified = True
    return modified

  def clear(self):
    self.data = None
    self.next = None

  def search(self, object1: int) -> int:
    current = self
    index = 0
    while current is not None:
      if current.data is object1:
        return index
      index += 1
      current = current.next
    return -1

  def count(self, object1: int):
    current = self
    count = 0
    while current is not None:
      if current.data is object1:
        count += 1
      current = current.next
    return count

  def peek(self, index: int):
    def get_node(self, index):
      current = self
      count = -1
      while current != None:
        if count == index:
          return current
        count += 1
        current = current.next
      raise IndexError(f"Out Of Bounds Index: {index}")

    return get_node(self, index - 1).data

  def peek_first(self):
    return self.data

  def peek_last(self):
    current = self
    while current.next is not None:
      current = current.next
    return current.data

  def pop(self, index: int):
    def get_node(self, index):
      current = self
      count = -1
      while current is not None:
        if count == index:
          return current
        count += 1
        current = current.next
      raise IndexError(f"Out Of Bounds Index: {index}")

    if index == 0:
      remove_data = self.data
      if self.next is not None:
        self.data = self.next.data
        self.next = self.next.next
      else:
        self.data = None
      return remove_data
    else:
      previous = get_node(self, index - 2)
      target = previous.next
      if target is None:
        raise IndexError(f"Out Of Bounds Index: {index}")
      previous.next = target.next
      return target.data

  def pop_first(self):
    return self.pop(0)

  def pop_last(self):
    removed_data = self.peek(self.size() - 1)
    self.remove(removed_data)
    return removed_data

  def insert(self, index: int, object1: int):
    def get_node(self, index):
      current = self
      count = -1
      while current is not None:
        if count == index:
          return current
        count += 1
        current = current.next
      raise IndexError(f"Out Of Bounds Index: {index}")

    if index == 0:
      new_node = A(self.data, self.next)
      self.data = object1
      self.next = new_node
    else:
      previous = get_node(self, index - 1)
      previous.next = A(object1, previous.next)

  def modify(self, index: int, object1: int):
    def get_node(self, index):
      current = self
      count = -1
      while current is not None:
        if count == index:
          return current
        count += 1
        current = current.next
      raise IndexError(f"Out Of Bounds Index: {index}")

    get_node(self, index - 1).data = object1

  def __reversed__(self):
    previous = None
    current = self
    while current is not None:
      next1 = current.next
      previous = current
      current = next1
    if previous is not None:
      self.data = previous.data
      self.next = previous.next

  def sort(self, comparator1):
    if self.data is None:
      return
    lista = self.to_list()
    lista.sort(key=comparator1)
    current = self
    for element in lista:
      current.data = element
      current = current.next
