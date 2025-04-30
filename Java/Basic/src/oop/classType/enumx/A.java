package oop.classType.enumx;

public enum A {
  A1("a", 1),
  B2("bb", 2),
  C3("ccc", 3);

  private final String NAME;
  private final int NUMBER;

  A(String name, int number) {
    this.NAME = name;
    this.NUMBER = number;
  }

  public String getName() {
    return NAME;
  }

  public int getNumber() {
    return NUMBER;
  }
}
