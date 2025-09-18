package collections.map.dynamic;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void printString(Map<?, ?> map1) {
    System.out.println(map1);
  }

  public static int size(Map<?, ?> map1) {
    return map1.size();
  }

  public static <K, V> V search(Map<K, V> map1, K key1) {
    return map1.get(key1);
  }

  public static <K> boolean containsKey(Map<K, ?> map1, K object1) {
    return map1.containsKey(object1);
  }

  public static <V> boolean containsValue(Map<?, V> map1, V object1) {
    return map1.containsValue(object1);
  }

  public static <K, V> boolean equals(Map<K, V> map1, Map<K, V> map2) {
    return map1.equals(map2);
  }

  public static Map<Object, Object> createEmpty() {
    // return Map.of();
    return new HashMap<>();
  }

  public static <K, V> Map<K, V> create(K key1, V param1, K key2, V param2, K key3, V param3) {
    // return Map.of(key1, param1, key2, param2, key3, param3);
    Map<K, V> map1 = new HashMap<>();
    map1.put(key1, param1);
    map1.put(key2, param2);
    map1.put(key3, param3);
    return map1;
  }

  public static <K, V> void append(Map<K, V> map1, K key1, V object1) {
    map1.put(key1, object1);
  }

  public static <K, V> void appendAll(Map<K, V> map1, Map<K, V> map2) {
    map1.putAll(map2);
  }

  public static <K, V> void update(Map<K, V> map1, K key1, V object1) {
    map1.replace(key1, object1);
  }

  public static <K> void remove(Map<K, ?> map1, K key1) {
    map1.remove(key1);
  }

  public static void removeAll(Map<?, ?> map1) {
    map1.clear();
  }

  public static void main(String[] args) {
    Map<Object, Object> map1 = new HashMap<>(Map.of(1, 1, 2, "string", "3s", true));

    printString(map1);
    System.out.println(size(map1));
    System.out.println(search(map1, 2));
    System.out.println(containsKey(map1, 2));
    System.out.println(containsValue(map1, "string"));
    System.out.println(equals(map1, new HashMap<>(Map.of(1, 1, 2, "string", "3s", true))));

    System.out.println(createEmpty());
    System.out.println(create(false, 1, 5, "string", "6s", true));
    append(map1, 3.14f, "append1");
    appendAll(map1, Map.of(3.14f, "append3", 3, "append4"));
    System.out.println(map1);
    update(map1, 3.14f, "append5");
    System.out.println(map1);
    remove(map1, 3.14f);
    System.out.println(map1);
    removeAll(map1);
    System.out.println(map1);
  }
}
