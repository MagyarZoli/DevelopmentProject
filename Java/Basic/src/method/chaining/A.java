package method.chaining;

public class A {
  public A method1() {
    System.out.println("method 1");
    return this;
  }

  public A method2() {
    System.out.println("method 2");
    return this;
  }

  public A method3() {
    System.out.println("method 3");
    return this;
  }

  public void method4() {
    System.out.println("method 4");
  }
}
