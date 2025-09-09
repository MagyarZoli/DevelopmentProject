package collections.array.dynamic;

import java.util.Arrays;

public class Main {
  public static <T> void printString(T[] array1) {
    System.out.println(Arrays.toString(array1));
  }

  public static <T> int size(T[] array1) {
    return array1.length;
  }

  public static <T> T searchWithIndex(T[] array1, int index) {
    return array1[index];
  }

  public static <T> boolean equals(T[] array1, T[] array2) {
    return Arrays.equals(array1, array2);
  }

  public static <T> T[] sub(T[] array1, int start, int end) {
    return Arrays.copyOfRange(array1, start, end);
  }

  public static Object[] createEmpty() {
    // return new Object[]{};
    return new Object[0];
  }

  @SuppressWarnings(value="unchecked")
  public static <T> T[] create(T param1, T param2, T param3) {
    return (T[]) new Object[]{param1, param2, param3};
  }

  public static <T> void updateWithIndex(T[] array1, int index, T object1) {
    array1[index] = object1;
  }

  public static void main(String[] args) {
    Object[] array1 = new Object[]{1, "string", true};

    printString(array1);
    System.out.println(size(array1));
    System.out.println(searchWithIndex(array1, 1));
    System.out.println(equals(array1, new Object[]{1, "string", true}));
    System.out.println(Arrays.toString(sub(array1, 1, 3)));

    System.out.println(Arrays.toString(createEmpty()));
    System.out.println(Arrays.toString(create(1, "string", true)));
    updateWithIndex(array1, 1, "update2");
    System.out.println(Arrays.toString(array1));
  }
}
