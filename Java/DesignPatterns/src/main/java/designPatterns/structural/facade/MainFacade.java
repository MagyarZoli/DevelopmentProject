package designPatterns.structural.facade;

public class MainFacade {
  public static void main(String[] args) {
    Facade facade = new Facade();

    System.out.println(facade.start());
  }
}
