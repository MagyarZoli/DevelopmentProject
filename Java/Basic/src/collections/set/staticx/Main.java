package collections.set.staticx;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void printString(Set<Integer> set1) {
    System.out.println(set1);
  }

  public static int size(Set<Integer> set1) {
    return set1.size();
  }

  public static <T> boolean contains(Set<Integer> set1, Integer object1) {
    return set1.contains(object1);
  }

  public static <T> boolean equals(Set<Integer> set1, Set<Integer> set2) {
    return set1.equals(set2);
  }

  public static <T> Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> set3 = new HashSet<>(set1);
    set3.addAll(set2);
    return set3;
  }

  public static <T> Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> set3 = new HashSet<>(set1);
    set3.retainAll(set2);
    return set3;
  }

  public static <T> Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> set3 = new HashSet<>(set1);
    set3.removeAll(set2);
    return set3;
  }


  public static Set<Integer> createEmpty() {
    //return Set.of();
    return new HashSet<>();
  }

  public static <T> Set<Integer> create(Integer param1, Integer param2, Integer param3) {
    //return Set.of(param1, param2, param3);
    Set<Integer> set1 = new HashSet<>();
    set1.add(param1);
    set1.add(param2);
    set1.add(param3);
    return set1;
  }

  public static void append(Set<Integer> set1, Integer object1) {
    set1.add(object1);
  }

  public static void appendAll(Set<Integer> set1, Set<Integer> set2) {
    set1.addAll(set2);
  }

  public static void remove(Set<Integer> set1, Integer object1) {
    set1.remove(object1);
  }

  public static void removeAll(Set<Integer> set1) {
    set1.clear();
  }

  public static void main(String[] args) {
    Set<Integer> set1 = new HashSet<>(Set.of(2, 3, 1, 4));

    printString(set1);
    System.out.println(size(set1));
    System.out.println(contains(set1, 2));
    System.out.println(equals(set1, new HashSet<>(Set.of(2, 3, 4, 1))));

    System.out.println(union(set1, Set.of(2, 3, 5)));
    System.out.println(intersection(set1, Set.of(2, 3, 5)));
    System.out.println(difference(set1, Set.of(2, 3, 5)));

    System.out.println(createEmpty());
    System.out.println(create(1, 2, 3));
    append(set1, 11);
    appendAll(set1, Set.of(33, 4));
    System.out.println(set1);
    remove(set1, 33);
    System.out.println(set1);
    removeAll(set1);
    System.out.println(set1);
  }
}
