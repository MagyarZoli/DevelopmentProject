package oop.annotationx.classx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class B implements InvocationHandler {
  private final Object target;
  private final String message;

  public B(Object target, String message) {
    this.target = target;
    this.message = message;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object result = method.invoke(target, args);
    System.out.println(message);
    return result;
  }

  @SuppressWarnings(value = "unchecked")
  public static <T> T createProxy(T object1) {
    Class<?> clazz = object1.getClass();
    if (clazz.isAnnotationPresent(A.class)) {
      A annotation1 = clazz.getAnnotation(A.class);
      return (T) Proxy.newProxyInstance(
          clazz.getClassLoader(),
          clazz.getInterfaces(),
          new B(object1, annotation1.param1())
      );
    }
    return object1;
  }
}
