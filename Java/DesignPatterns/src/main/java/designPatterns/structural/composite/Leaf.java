package designPatterns.structural.composite;

public class Leaf {
  static class A implements Component {
    private String value1;
    private Integer value2;

    public A(String value1, Integer value2) {
      this.value1 = value1;
      this.value2 = value2;
    }

    @Override
    public String show() {
      return value1 + ", " + value2;
    }
  }

  static class B implements Component {
    private String value1;
    private Integer value2;
    private Boolean value3;

    public B(String value1, Integer value2, Boolean value3) {
      this.value1 = value1;
      this.value2 = value2;
      this.value3 = value3;
    }

    @Override
    public String show() {
      return value1 + ", " + value2 + ", " + value3;
    }
  }
}
