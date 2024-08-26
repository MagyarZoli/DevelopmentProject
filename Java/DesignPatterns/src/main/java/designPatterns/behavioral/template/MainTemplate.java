package designPatterns.behavioral.template;

public class MainTemplate {
  public static void main(String[] args) {
    Super sup = new ConcreteSub.A();
    System.out.println(sup.play());

    sup = new ConcreteSub.B();
    System.out.println(sup.play());
  }
}
