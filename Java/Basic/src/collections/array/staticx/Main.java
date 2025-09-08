package collections.array.staticx;

import java.util.Arrays;

public class Main {
  public static  void printString(Integer[] array1) {
    System.out.println(Arrays.toString(array1));
  }

  public static int size(Integer[] array1) {
    return array1.length;
  }

  public static Integer searchWithIndex(Integer[] array1, int index) {
    return array1[index];
  }

  public static boolean equals(Integer[] array1, Integer[] array2) {
    return Arrays.equals(array1, array2);
  }

  public static Integer[] sub(Integer[] array1, int start, int end) {
    return Arrays.copyOfRange(array1, start, end);
  }

  public static void sort(Integer[] array1) {
    Arrays.sort(array1);
  }

  public static Integer[] createEmpty() {
    // return new Integer[]{};
    return new Integer[0];
  }

  public static  Integer[] create(Integer param1, Integer param2, Integer param3) {
    return new Integer[]{param1, param2, param3};
  }

  public static void updateWithIndex(Integer[] array1, int index, Integer object1) {
    array1[index] = object1;
  }

  public static void main(String[] args) {
    Integer[] array1 = {2, 3, 1, 4};

    printString(array1);
    System.out.println(size(array1));
    System.out.println(searchWithIndex(array1, 1));
    System.out.println(equals(array1, new Integer[]{2, 3, 1, 4}));
    System.out.println(Arrays.toString(sub(array1, 1, 3)));

    sort(array1);
    System.out.println(Arrays.toString(array1));

    System.out.println(Arrays.toString(createEmpty()));
    System.out.println(Arrays.toString(create(1, 2, 3)));
    updateWithIndex(array1, 1, 22);
    System.out.println(Arrays.toString(array1));
  }
}
