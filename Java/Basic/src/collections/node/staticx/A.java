package collections.node.staticx;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Objects;

public class A {
  private Integer data;
  private A next;

  public A() {
    this.data = null;
    this.next = null;
  }

  private A(Integer data, A next) {
    this.data = data;
    this.next = next;
  }

  @Override
  public String toString() {
    String result = "A{";
    A current = this;
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
    A current = this;
    for (int i = 0; i < size(); i++) {
      if (current.data != null) {
        result += "(d,";
      } else {
        result += "(x,";
      }
      if (i != size() - 1) {
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
    A a = (A) object1;
    if (!Objects.equals(data, a.data)) return false;
    return Objects.equals(next, a.next);
  }

  public int size() {
    int count = 0;
    A current = this;
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
    A current = this;
    while (current != null) {
      if ((current.data == null && object1 == null) || (current.data != null && current.data.equals(object1))) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public Integer[] toArray() {
    Integer[] array = new Integer[size()];
    int i = 0;
    for (A current = this; current != null; current = current.next) {
      array[i++] = current.data;
    }
    return array;
  }

  public boolean add(Integer object1) {
    A current = this;
    if (current.data == null && current.next == null) {
      current.data = object1;
    } else {
      while (current.next != null) {
        current = current.next;
      }
      current.next = new A(object1, null);
    }
    return true;
  }

  public boolean remove(Integer object1) {
    A current = this;
    A previous = null;
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

  public boolean addAll(Collection<? extends Integer> collection1) {
    boolean modified = false;
    for (Integer e : collection1) {
      if (add(e)) {
        modified = true;
      }
    }
    return modified;
  }

  public boolean addAll(A c) {
    boolean modified = false;
    A current = c;
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

  public int search(Integer object1) {
    A current = this;
    int index = 0;
    while (current != null) {
      if (current.data.equals(object1)) {
        return index;
      }
      index++;
      current = current.next;
    }
    return -1;
  }

  public int count(Integer object1) {
    A current = this;
    int count = 0;
    while (current != null) {
      if (current.data.equals(object1)) {
        count++;
      }
      current = current.next;
    }
    return count;
  }

  public Integer peek(int index) {
    return getNode(index - 1).data;
  }

  public Integer peekFirst() {
    return data;
  }

  public Integer peekLast() {
    A current = this;
    while (current.next != null) {
      current = current.next;
    }
    return current.data;
  }

  public Integer pop(int index) {
    if (index == 0) {
      Integer removedData = data;
      if (next != null) {
        data = next.data;
        next = next.next;
      } else {
        data = null;
      }
      return removedData;
    } else {
      A previous = getNode(index - 2);
      A target = previous.next;
      if (target == null) throw new IndexOutOfBoundsException("Index: " + index);
      previous.next = target.next;
      return target.data;
    }
  }

  public Integer popFirst() {
    return pop(0);
  }

  public Integer popLast() {
    Integer removedData = peek(size() - 1);
    remove(removedData);
    return removedData;
  }

  public void insert(int index, Integer object1) {
    if (index == 0) {
      A newNode = new A(data, next);
      data = object1;
      next = newNode;
    } else {
      A previous = getNode(index - 1);
      previous.next = new A(object1, previous.next);
    }
  }

  public void modify(int index, Integer object1) {
    getNode(index - 1).data = object1;
  }

  public void reverse() {
    A previous = null;
    A current = this;
    while (current != null) {
      A next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    if (previous != null) {
      this.data = previous.data;
      this.next = previous.next;
    }
  }

  public void sort(Comparator<? super Integer> comparator1) {
    if (data == null) return;
    Integer[] array = toArray();
    Arrays.sort(array, comparator1);
    A current = this;
    for (Integer element : array) {
      current.data = element;
      current = current.next;
    }
  }

  private A getNode(int index) {
    A current = this;
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
