package designPatterns.behavioral.iterator;

public class MainIterator {
  public static void main(String[] args) {
    String[] values = new String[]{"val1", "val2", "val3", "val4"};
    Repository repository = new Repository(values);
    Iterator iter = repository.getIterator();

    while (iter.hasNext()) {
      System.out.println(iter.next());
    }
  }
}
