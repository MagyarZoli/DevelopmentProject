package collections.args.dynamic;

import java.util.Arrays;

public class Main {
  @SafeVarargs
  public static <T> void printString(T... args1){
    System.out.println(Arrays.toString(args1));
  }

  @SafeVarargs
  public static <T> int size(T... args1) {
    return args1.length;
  }

  @SafeVarargs
  public static <T> T searchWithIndex(int index, T... args1) {
    return args1[index];
  }

  @SafeVarargs
  public static <T> T[] sub(int start, int end, T... args1) {
    return Arrays.copyOfRange(args1, start, end);
  }

  @SafeVarargs
  public static <T> T[] create(T... param1) {
    return param1;
  }

  @SafeVarargs
  public static <T> T[] updateWithIndex(int index, T object1, T... args1) {
    args1[index] = object1;
    return args1;
  }

  public static void main(String[] args) {
    int a = 1;
    String b = "string";
    boolean c = true;

    printString(a, b, c);
    System.out.println(size(a, b, c));
    System.out.println(searchWithIndex(1, a, b, c));
    System.out.println(Arrays.toString(sub(1, 3, a, b, c)));

    System.out.println(Arrays.toString(create(a, b, c)));
    System.out.println(Arrays.toString(updateWithIndex(2, false, a, b, c)));
  }
}
