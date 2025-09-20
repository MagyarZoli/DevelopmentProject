package collections.queue.staticx;

import java.util.*;

public class Main {
  public static void printString(Deque<Integer> deque1){
    System.out.println(deque1);
  }

  public static int size(Deque<Integer> deque1) {
    return deque1.size();
  }

  public static boolean contains(Deque<Integer> deque1, Integer object1) {
    return deque1.contains(object1);
  }

  public static Deque<Integer> createEmpty() {
    return new LinkedList<>();
  }

  public static Deque<Integer> create(Integer param1, Integer param2, Integer param3) {
    // Deque<Integer> deque1 = new LinkedList<>();
    // deque1.add(param1);
    // deque1.add(param2);
    // deque1.add(param3);
    // return deque1;
    Deque<Integer> deque1 = new LinkedList<>();
    deque1.offer(param1);
    deque1.offer(param2);
    deque1.offer(param3);
    return deque1;
  }

  public static void append(Deque<Integer> deque1, Integer object1) {
    // deque1.add(object1);
    deque1.offer(object1);
  }

  public static void appendFirst(Deque<Integer> deque1, Integer object1) {
    // deque1.addFirst(object1);
    deque1.offerFirst(object1);
  }

  public static void appendLast(Deque<Integer> deque1, Integer object1) {
    // deque1.addLast(object1);
    deque1.offerLast(object1);
  }

  public static void remove(Deque<Integer> deque1, Integer object1) {
    deque1.remove(object1);
  }

  public static void removeFirst(Deque<Integer> deque1) {
    // deque1.poll();
    deque1.pollFirst();
  }

  public static void removeLast(Deque<Integer> deque1) {
    deque1.pollLast();
  }

  public static void removeAll(Deque<Integer> deque1) {
    deque1.clear();
  }

  public static void main(String[] args) {
    Deque<Integer> deque1 = new LinkedList<>();
    deque1.add(2);
    deque1.add(3);
    deque1.add(4);
    deque1.add(1);

    printString(deque1);
    System.out.println(size(deque1));
    System.out.println(contains(deque1, 2));

    System.out.println(createEmpty());
    System.out.println(create(1, 2, 3));
    append(deque1, 11);
    appendFirst(deque1, 22);
    appendLast(deque1, 33);
    System.out.println(deque1);
    remove(deque1, 11);
    removeFirst(deque1);
    removeLast(deque1);
    System.out.println(deque1);
    removeAll(deque1);
    System.out.println(deque1);
  }
}
