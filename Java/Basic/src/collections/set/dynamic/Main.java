package collections.list.dynamic;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void printString(List<?> list1){
    System.out.println(list1);
  }

  public static int size(List<?> list1) {
    return list1.size();
  }

  public static <T> T searchWithIndex(List<T> list1, int index) {
    return list1.get(index);
  }

  public static <T> int search(List<T> list1, T object1) {
    return list1.indexOf(object1);
  }

  public static <T> boolean contains(List<T> list1, T object1) {
    return list1.contains(object1);
  }

  public static <T> boolean equals(List<T> list1, List<T> list2) {
    return list1.equals(list2);
  }

  public static <T> List<T> sub(List<T> list1, int start, int end) {
    return list1.subList(start, end);
  }

  public static List<Object> createEmpty() {
    // return List.of();
    return new ArrayList<>();
  }

  public static <T> List<T> create(T param1, T param2, T param3) {
    // return List.of(param1, param2, param3);
    List<T> list1 = new ArrayList<>();
    list1.add(param1);
    list1.add(param2);
    list1.add(param3);
    return list1;
  }

  public static <T> void append(List<T> list1, T object1) {
    list1.add(object1);
  }

  public static <T> void appendWithIndex(List<T> list1, int index, T object1) {
    list1.add(index, object1);
  }

  public static <T> void appendAll(List<T> list1, List<T> list2) {
    list1.addAll(list2);
  }

  public static <T> void updateWithIndex(List<T> list1, int index, T object1) {
    list1.set(index, object1);
  }

  public static <T> void remove(List<T> list1, T object1) {
    list1.remove(object1);
  }

  public static void removeWithIndex(List<?> list1, int index) {
    list1.remove(index);
  }

  public static void removeAll(List<?> list1) {
    list1.clear();
  }

  public static void main(String[] args) {
    List<Object> list1 = new ArrayList<>(List.of(1, "string", true));

    printString(list1);
    System.out.println(size(list1));
    System.out.println(searchWithIndex(list1, 1));
    System.out.println(search(list1, "string"));
    System.out.println(contains(list1, "string"));
    System.out.println(equals(list1, List.of(1, "string", true)));
    System.out.println(sub(list1, 1, 3));

    System.out.println(createEmpty());
    System.out.println(create(1, "string", true));
    append(list1, "append1");
    appendWithIndex(list1, 1, "append2");
    appendAll(list1, List.of("append3", "append4"));
    System.out.println(list1);
    updateWithIndex(list1, 1, "update2");
    System.out.println(list1);
    remove(list1, "append3");
    removeWithIndex(list1, 1);
    System.out.println(list1);
    removeAll(list1);
    System.out.println(list1);
  }
}
