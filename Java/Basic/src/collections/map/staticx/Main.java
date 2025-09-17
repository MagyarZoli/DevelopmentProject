package collections.map.staticx;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void printString(Map<String, Integer> map1) {
    System.out.println(map1);
  }

  public static int size(Map<String, Integer> map1) {
    return map1.size();
  }

  public static Integer search(Map<String, Integer> map1, String key1) {
    return map1.get(key1);
  }

  public static boolean containsKey(Map<String, Integer> map1, String object1) {
    return map1.containsKey(object1);
  }

  public static boolean containsValue(Map<String, Integer> map1, Integer object1) {
    return map1.containsValue(object1);
  }

  public static boolean equals(Map<String, Integer> map1, Map<String, Integer> map2) {
    return map1.equals(map2);
  }

  public static Map<String, Integer> createEmpty() {
    // return Map.of();
    return new HashMap<>();
  }

  public static <K, V> Map<String, Integer> create(String key1, Integer param1, String key2, Integer param2, String key3, Integer param3) {
    // return Map.of(key1, param1, key2, param2, key3, param3);
    Map<String, Integer> map1 = new HashMap<>();
    map1.put(key1, param1);
    map1.put(key2, param2);
    map1.put(key3, param3);
    return map1;
  }

  public static void append(Map<String, Integer> map1, String key1, Integer object1) {
    map1.put(key1, object1);
  }

  public static void appendAll(Map<String, Integer> map1, Map<String, Integer> map2) {
    map1.putAll(map2);
  }

  public static void update(Map<String, Integer> map1, String key1, Integer object1) {
    map1.replace(key1, object1);
  }

  public static void remove(Map<String, Integer> map1, String key1) {
    map1.remove(key1);
  }

  public static void removeAll(Map<String, Integer> map1) {
    map1.clear();
  }

  public static void main(String[] args) {
    Map<String, Integer> map1 = new HashMap<>(Map.of("2s", 2, "3s", 3, "4s", 1, "1s", 4));

    printString(map1);
    System.out.println(size(map1));
    System.out.println(search(map1, "2s"));
    System.out.println(containsKey(map1, "2s"));
    System.out.println(containsValue(map1, 2));
    System.out.println(equals(map1, new HashMap<>(Map.of("2s", 2, "3s", 3, "4s", 1, "1s", 4))));

    System.out.println(createEmpty());
    System.out.println(create("1s", 1, "2s", 2, "3s", 3));
    append(map1, "5s", 11);
    appendAll(map1, Map.of("3s", 33, "6s", 44));
    System.out.println(map1);
    update(map1, "3s", 55);
    System.out.println(map1);
    remove(map1, "3s");
    System.out.println(map1);
    removeAll(map1);
    System.out.println(map1);
  }
}
