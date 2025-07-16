package method.array;

import java.util.Arrays;

public class Main {
  public static void voidMethod(String[] array) {
    System.out.println(Arrays.toString(array));
  }

  public static String[] returnMethod(String[] array) {
    return array;
  }

  public static void main(String[] args) {
    voidMethod(new String[]{"param1", "param2", "param3"});
    System.out.println(Arrays.toString(returnMethod(new String[]{"param1", "param2", "param3"})));
  }
}
