package designPatterns.creational.singleton;

import java.time.LocalDateTime;

public class Singleton {
  private static Singleton instance;
  private LocalDateTime date;

  private Singleton() {}

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
      instance.date = LocalDateTime.now();
    }
    return instance;
  }

  public LocalDateTime getDate() {
    return date;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Singleton) {
      if (((Singleton) obj).getDate().equals(date)) {
        return super.equals(obj);
      }
    }
    return false;
  }
}
