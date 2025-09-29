package collections.node.dynamic;

import java.util.*;

public class A<E> {
  private E data;
  private A<E> next;

  public A() {
    this.data = null;
    this.next = null;
  }

  private A(E data, A<E> next) {
    this.data = data;
    this.next = next;
  }

  @Override
  public String toString() {
    String result = "A{";
    A<E> current = this;
    int size = size();
    for (int i = 0; i < size; i++) {
      if (current.data != null) {
        result += current.data.toString();
      }
      if (i != size - 1) {
        result += ", ";
      }
      current = current.next;
    }
    return result + "}";
  }

  public String graph() {
    String result = "";
    A<E> current = this;
    int size = size();
    for (int i = 0; i < size; i++) {
      if (current.data != null) {
        result += "(d,";
      } else {
        result += "(x,";
      }
      if (i != size - 1) {
        result += "n)-";
      } else {
        result += "x)";
      }
      current = current.next;
    }
    return result;
  }

  @Override
  public boolean equals(Object object1) {
    if (this == object1) return true;
    if (object1 == null || getClass() != object1.getClass()) return false;
    A<?> a = (A<?>) object1;
    if (!Objects.equals(data, a.data)) return false;
    return Objects.equals(next, a.next);
  }

  public int size() {
    int count = 0;
    A<E> current = this;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public boolean isEmpty() {
    return data == null && next == null;
  }

  public boolean contains(Object object1) {
    A<E> current = this;
    while (current != null) {
      if ((current.data == null && object1 == null) || (current.data != null && current.data.equals(object1))) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public Object[] toArray() {
    Object[] array = new Object[size()];
    int i = 0;
    for (A<E> current = this; current != null; current = current.next) {
      array[i++] = current.data;
    }
    return array;
  }

  public boolean add(E object1) {
    A<E> current = this;
    if (current.data == null && current.next == null) {
      current.data = object1;
    } else {
      while (current.next != null) {
        current = current.next;
      }
      current.next = new A<>(object1, null);
    }
    return true;
  }

  public boolean remove(Object object1) {
    A<E> current = this;
    A<E> previous = null;
    while (current != null) {
      if ((current.data == null && object1 == null) || (current.data != null && current.data.equals(object1))) {
        if (previous == null) {
          if (current.next != null) {
            current.data = current.next.data;
            current.next = current.next.next;
          } else {
            current.data = null;
          }
        } else {
          previous.next = current.next;
        }
        return true;
      }
      previous = current;
      current = current.next;
    }
    return false;
  }

  public boolean containsAll(Collection<?> collection1) {
    for (Object e : collection1) {
      if (!contains(e)) {
        return false;
      }
    }
    return true;
  }

  public boolean addAll(Collection<? extends E> collection1) {
    boolean modified = false;
    for (E e : collection1) {
      if (add(e)) {
        modified = true;
      }
    }
    return modified;
  }

  @SuppressWarnings("unchecked")
  public boolean addAll(A<? extends E> c) {
    boolean modified = false;
    A<E> current = (A<E>) c;
    while (true) {
      if (add(current.data)) {
        modified = true;
      }
      if (current.next != null) {
        current = current.next;
      } else {
        break;
      }
    }
    return modified;
  }

  public void clear() {
    data = null;
    next = null;
  }

  public int search(E object1) {
    A<E> current = this;
    int index = 0;
    while (current != null) {
      if (current.data == object1) {
        return index;
      }
      index++;
      current = current.next;
    }
    return -1;
  }

  public int count(E object1) {
    A<E> current = this;
    int count = 0;
    while (current != null) {
      if (current.data == object1) {
        count++;
      }
      current = current.next;
    }
    return count;
  }

  public E peek(int index) {
    return getNode(index - 1).data;
  }

  public E peekFirst() {
    return data;
  }

  public E peekLast() {
    A<E> current = this;
    while (current.next != null) {
      current = current.next;
    }
    return current.data;
  }

  public E pop(int index) {
    if (index == 0) {
      E removedData = data;
      if (next != null) {
        data = next.data;
        next = next.next;
      } else {
        data = null;
      }
      return removedData;
    } else {
      A<E> previous = getNode(index - 2);
      A<E> target = previous.next;
      if (target == null) throw new IndexOutOfBoundsException("Index: " + index);
      previous.next = target.next;
      return target.data;
    }
  }

  public E popFirst() {
    return pop(0);
  }

  public E popLast() {
    E removedData = peek(size() - 1);
    remove(removedData);
    return removedData;
  }

  public void insert(int index, E object1) {
    if (index == 0) {
      A<E> newNode = new A<>(data, next);
      data = object1;
      next = newNode;
    } else {
      A<E> previous = getNode(index - 1);
      previous.next = new A<>(object1, previous.next);
    }
  }

  public void modify(int index, E object1) {
    getNode(index - 1).data = object1;
  }

  public void reverse() {
    A<E> previous = null;
    A<E> current = this;
    while (current != null) {
      A<E> next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    if (previous != null) {
      this.data = previous.data;
      this.next = previous.next;
    }
  }

  @SuppressWarnings("unchecked")
  public void sort(Comparator<? super E> comparator1) {
    if (data == null) return;
    Object[] array = toArray();
    Arrays.sort(array, (Comparator<Object>) comparator1);
    A<E> current = this;
    for (Object element : array) {
      current.data = (E) element;
      current = current.next;
    }
  }

  private A<E> getNode(int index) {
    A<E> current = this;
    int count = -1;
    while (current != null) {
      if (count == index) {
        return current;
      }
      count++;
      current = current.next;
    }
    throw new IndexOutOfBoundsException("Index: " + index);
  }
}
