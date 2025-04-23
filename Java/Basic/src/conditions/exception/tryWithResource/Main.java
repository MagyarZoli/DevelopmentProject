package conditions.exception.tryWithResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void tryWithResource() {
    try (Scanner scanner = new Scanner(new File("src/conditions/exception/tryWithResource/text.txt"))) {
      while (scanner.hasNext()) {
        System.out.println(scanner.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    tryWithResource();
  }
}
