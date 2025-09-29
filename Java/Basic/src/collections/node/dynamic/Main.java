package collections.node.dynamic;

public class Main {
  public static void printString(A<?> node1){
    System.out.println(node1);
  }

  public static int size(A<?> node1) {
    return node1.size();
  }

  public static <T> T searchWithIndex(A<T> node1, int index) {
    return node1.peek(index);
  }

  public static <T> int search(A<T> node1, T object1) {
    return node1.search(object1);
  }

  public static <T> boolean contains(A<T> node1, T object1) {
    return node1.contains(object1);
  }

  public static <T> boolean equals(A<T> node1, A<T> node2) {
    return node1.equals(node2);
  }

  public static <T> int count(A<T> node1, T object1) {
    return node1.count(object1);
  }

  public static A<Object> createEmpty() {
    return new A<>();
  }

  public static <T> A<T> create(T param1, T param2, T param3) {
    A<T> node1 = new A<>();
    node1.add(param1);
    node1.add(param2);
    node1.add(param3);
    return node1;
  }

  public static <T> void append(A<T> node1, T object1) {
    node1.add(object1);
  }

  public static <T> void appendWithIndex(A<T> node1, int index, T object1) {
    node1.insert(index, object1);
  }

  public static <T> void appendFirst(A<T> node1, T object1) {
    node1.insert(0, object1);
  }

  public static <T> void appendLast(A<T> node1, T object1) {
    node1.add(object1);
  }

  public static <T> void appendAll(A<T> node1, A<T> node2) {
    node1.addAll(node2);
  }

  public static <T> void updateWithIndex(A<T> node1, int index, T object1) {
    node1.modify(index, object1);
  }

  public static <T> void remove(A<T> node1, T object1) {
    node1.remove(object1);
  }

  public static void removeWithIndex(A<?> node1, int index) {
    node1.pop(index);
  }

  public static <T> void removeFirst(A<T> node1) {
    // node1.remove(0);
    // node1.pop(0);
    node1.popFirst();
  }

  public static <T> void removeLast(A<T> node1) {
    node1.popLast();
  }

  public static void removeAll(A<?> node1) {
    node1.clear();
  }

  public static void main(String[] args) {
    A<Object> node1 = new A<>();
    node1.add(1);
    node1.add("string");
    node1.add(true);
    A<Object> node2 = new A<>();
    node2.add(1);
    node2.add("string");
    node2.add(true);
    A<Object> node3 = new A<>();
    node3.add("append3");
    node3.add("append4");

    printString(node1);
    System.out.println(size(node1));
    System.out.println(searchWithIndex(node1, 1));
    System.out.println(search(node1, "string"));
    System.out.println(contains(node1, "string"));
    System.out.println(equals(node1, node2));
    System.out.println(count(node1, "string"));

    System.out.println(createEmpty());
    System.out.println(create(1, "string", true));
    append(node1, "append1");
    appendWithIndex(node1, 1, "append2");
    appendFirst(node1, "append5");
    appendLast(node1, "append6");
    appendAll(node1, node3);
    System.out.println(node1);
    updateWithIndex(node1, 1, "update2");
    System.out.println(node1.graph());
    System.out.println(node1);
    remove(node1, "append3");
    removeWithIndex(node1, 1);
    removeFirst(node1);
    removeLast(node1);
    System.out.println(node1.graph());
    System.out.println(node1);
    removeAll(node1);
    System.out.println(node1.graph());
    System.out.println(node1);
  }
}