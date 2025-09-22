package collections.args.staticx;

import java.util.Arrays;

public class Main {
  public static void printString(int... args1){
    System.out.println(Arrays.toString(args1));
  }

  public static int size(int... args1) {
    return args1.length;
  }

  public static int searchWithIndex(int index, int... args1) {
    return args1[index];
  }

  public static int[] sub(int start, int end, int... args1) {
    return Arrays.copyOfRange(args1, start, end);
  }

  public static int[] sort(int... args1) {
    Arrays.sort(args1);
    return args1;
  }

  public static int[] create(int... param1) {
    return param1;
  }

  public static int[] updateWithIndex(int index, int object1, int... args1) {
    args1[index] = object1;
    return args1;
  }

  public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = 1;
    int d = 4;

    printString(a, b, c, d);
    System.out.println(size(a, b, c, d));
    System.out.println(searchWithIndex(1, a, b, c, d));
    System.out.println(Arrays.toString(sub(1, 3, a, b, c, d)));
    System.out.println(Arrays.toString(sort(a, b, c, d)));

    System.out.println(Arrays.toString(create(a, b, c, d)));
    System.out.println(Arrays.toString(updateWithIndex(2, 11, a, b, c, d)));
  }
}
