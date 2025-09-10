package collections.list.staticx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void printString(List<Integer> list1){
    System.out.println(list1);
  }

  public static int size(List<Integer> list1) {
    return list1.size();
  }

  public static Integer searchWithIndex(List<Integer> list1, int index) {
    return list1.get(index);
  }

  public static int search(List<Integer> list1, Integer object1) {
    return list1.indexOf(object1);
  }

  public static boolean contains(List<Integer> list1, Integer object1) {
    return list1.contains(object1);
  }

  public static boolean equals(List<Integer> list1, List<Integer> list2) {
    return list1.equals(list2);
  }

  public static List<Integer> sub(List<Integer> list1, int start, int end) {
    return list1.subList(start, end);
  }

  public static void sort(List<Integer> list1) {
    Collections.sort(list1);
  }

  public static List<Integer> createEmpty() {
    // return List.of();
    return new ArrayList<>();
  }

  public static List<Integer> create(Integer param1, Integer param2, Integer param3) {
    // return List.of(param1, param2, param3);
    List<Integer> list1 = new ArrayList<>();
    list1.add(param1);
    list1.add(param2);
    list1.add(param3);
    return list1;
  }

  public static void append(List<Integer> list1, Integer object1) {
    list1.add(object1);
  }

  public static void appendWithIndex(List<Integer> list1, int index, Integer object1) {
    list1.add(index, object1);
  }

  public static void appendAll(List<Integer> list1, List<Integer> list2) {
    list1.addAll(list2);
  }

  public static void updateWithIndex(List<Integer> list1, int index, Integer object1) {
    list1.set(index, object1);
  }

  public static void remove(List<Integer> list1, Integer object1) {
    list1.remove(object1);
  }

  public static void removeWithIndex(List<Integer> list1, int index) {
    list1.remove(index);
  }

  public static void removeAll(List<Integer> list1) {
    list1.clear();
  }

  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>(List.of(2, 3, 1, 4));

    printString(list1);
    System.out.println(size(list1));
    System.out.println(searchWithIndex(list1, 1));
    System.out.println(search(list1, 3));
    System.out.println(contains(list1, 1));
    System.out.println(equals(list1, List.of(2, 3, 1, 4)));
    System.out.println(sub(list1, 1, 3));

    sort(list1);
    System.out.println(list1);

    System.out.println(createEmpty());
    System.out.println(create(1, 2, 3));
    append(list1, 11);
    appendWithIndex(list1, 1, 22);
    appendAll(list1, List.of(33, 44));
    System.out.println(list1);
    updateWithIndex(list1, 1, 222);
    System.out.println(list1);
    remove(list1, 33);
    removeWithIndex(list1, 1);
    System.out.println(list1);
    removeAll(list1);
    System.out.println(list1);
  }
}
