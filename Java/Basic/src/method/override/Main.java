package method.override;

public class Main {
  public static void main(String[] args) {
    B b = new B();

    b.aMethod();
    B.aStaticMethod();
  }
}
