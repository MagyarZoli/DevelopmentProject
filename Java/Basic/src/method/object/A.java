package method.object;

public class A {
  public String field;

  public A(String field) {
    this.field = field;
  }

  @Override
  public String toString() {
    return "A{" +
        "field='" + field + '\'' +
        '}';
  }
}
