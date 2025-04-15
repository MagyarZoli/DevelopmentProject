package conditions.loop.forx;

public class Main {
  public static void forLoop() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
    // for (int i = 0; i < 10; i++)
    //   System.out.println(i);
    // for (int i = 0; i < 10; i++) System.out.println(i);
  }

  public static void reverseLoop() {
    for (int i = 9; i >= 0; i--) {
      System.out.println(i);
    }
  }

  public static void assignmentLoop() {
    for (int i = 0; i < 10; i += 3) {
      System.out.println(i);
    }
  }

  public static void omitExpression1() {
    int i = 0;
    for (; i < 10; i += 3) {
      System.out.println(i);
    }
  }

  public static void omitExpression3() {
    for (int i = 0; i < 10;) {
      System.out.println(i);
      i++;
    }
  }

  public static void infiniteLoop() {
    int i = 0;
    for (;;) {
      System.out.println(i++);
      if (i >= 10) break;
    }
  }

  public static void main(String[] args) {
    forLoop();
    reverseLoop();
    assignmentLoop();
    omitExpression1();
    omitExpression3();
    infiniteLoop();
  }
}
