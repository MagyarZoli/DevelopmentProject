package method.chaining;

public class Main {
  public static void main(String[] args) {
    A a = new A();

    a.method1()
        .method2()
        .method3()
        .method2()
        .method4();
  }
}
