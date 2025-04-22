package conditions.exception.tryCatch;

public class Main {
  public static void throwException() {
    throw new RuntimeException("throw exception!");
  }

  public static void tryCatchException() {
    try {
      throwException();
      System.out.println("correct!");
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("finally.");
    }
  }

  public static void main(String[] args) {
    tryCatchException();
  }
}
