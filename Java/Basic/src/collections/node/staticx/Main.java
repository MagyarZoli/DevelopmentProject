package collections.node.staticx;

public class Main {
  public static void printString(A node1){
    System.out.println(node1);
  }

  public static int size(A node1) {
    return node1.size();
  }

  public static Integer searchWithIndex(A node1, int index) {
    return node1.peek(index);
  }

  public static int search(A node1, Integer object1) {
    return node1.search(object1);
  }

  public static boolean contains(A node1, Integer object1) {
    return node1.contains(object1);
  }

  public static boolean equals(A node1, A node2) {
    return node1.equals(node2);
  }

  public static int count(A node1, Integer object1) {
    return node1.count(object1);
  }

  public static A createEmpty() {
    return new A();
  }

  public static A create(Integer param1, Integer param2, Integer param3) {
    A node1 = new A();
    node1.add(param1);
    node1.add(param2);
    node1.add(param3);
    return node1;
  }

  public static void append(A node1, Integer object1) {
    node1.add(object1);
  }

  public static void appendWithIndex(A node1, int index, Integer object1) {
    node1.insert(index, object1);
  }

  public static void appendFirst(A node1, Integer object1) {
    node1.insert(0, object1);
  }

  public static void appendLast(A node1, Integer object1) {
    node1.add(object1);
  }

  public static void appendAll(A node1, A node2) {
    node1.addAll(node2);
  }

  public static void updateWithIndex(A node1, int index, Integer object1) {
    node1.modify(index, object1);
  }

  public static void remove(A node1, Integer object1) {
    node1.remove(object1);
  }

  public static void removeWithIndex(A node1, int index) {
    node1.pop(index);
  }

  public static void removeFirst(A node1) {
    // node1.remove(0);
    // node1.pop(0);
    node1.popFirst();
  }

  public static void removeLast(A node1) {
    node1.popLast();
  }

  public static void removeAll(A node1) {
    node1.clear();
  }

  public static void main(String[] args) {
    A node1 = new A();
    node1.add(2);
    node1.add(3);
    node1.add(1);
    node1.add(4);
    A node2 = new A();
    node2.add(2);
    node2.add(3);
    node2.add(1);
    node2.add(4);
    A node3 = new A();
    node3.add(33);
    node3.add(44);

    printString(node1);
    System.out.println(size(node1));
    System.out.println(searchWithIndex(node1, 1));
    System.out.println(search(node1, 2));
    System.out.println(contains(node1, 2));
    System.out.println(equals(node1, node2));
    System.out.println(count(node1, 2));

    System.out.println(createEmpty());
    System.out.println(create(1, 2, 3));
    append(node1, 11);
    appendWithIndex(node1, 1, 22);
    appendFirst(node1, 55);
    appendLast(node1, 66);
    appendAll(node1, node3);
    System.out.println(node1);
    updateWithIndex(node1, 1, 222);
    System.out.println(node1.graph());
    System.out.println(node1);
    remove(node1, 33);
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